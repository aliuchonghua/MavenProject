package org.westos.web01.annotation;
import org.westos.web01.Util.SpringUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/8/26.
 */
public class Client {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //获取注解
        MyDocument md=new MyDocument();
        Method[] methods = md.getClass().getMethods();
        for(Method m:methods){
            //获取方法上的注解
            MyValue anno = m.getAnnotation(MyValue.class);
            if(anno!=null){
                m.invoke(md,new Object[]{anno.value()});
            }
        }
        System.out.println(md.getName());

        MyDocument myDocument= SpringUtil.getInstance().getContext().getBean(MyDocument.class);
        System.out.println(myDocument);

    }
}
