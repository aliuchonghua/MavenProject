package org.westos.web01.IOC模型;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
//老师的ioc里面
public class Factory {
    public static Object creat(String objname) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        //读取文件
        String classstr = FileUtils.readFileToString(new File("config.txt"), "utf-8");
        //将文件解析成JSON
        JSONObject json = JSON.parseObject(classstr);
        //根据json对象创建对象
        Map map=new HashMap();
        for (String key:json.keySet()){
            //通过key获取v
            String classname = json.getJSONObject(key).getString("classname");
            JSONArray props = json.getJSONObject(key).getJSONArray("props");
            //通过类名获取类实例
            Object obj = createobjbyClassname(classname);
            //创建obj的属性
            for (int i = 0; i < props.size(); i++) {
                //获取属性定义
                JSONObject p = props.getJSONObject(i);
                //创建属性的类
                Object pobj = createobjbyClassname(p.getString("classname"));
                //调用对象的set方法设置属性值
                bindProperty(obj,p.getString("name"),pobj);
            }

        }
        return null;
    }

    /**
     * 给对象的属性上绑定具体的值
     * @param obj:要绑定属性的对象
     * @param name:属性名
     * @param pobj:属性值
     */
    private static void bindProperty(Object obj, String name, Object pobj) {
        //找到所有的方法
        Method[] methods = obj.getClass().getMethods();
        //查找属性的Set
    }

    private static Object createobjbyClassname(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName(classname);
        return cls.newInstance();
    }
}
