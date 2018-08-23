package org.westos.web01.IOC模型;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Factory {
public static Object creat(String objname) throws IOException {
    //读取文件
    String classstr= FileUtils.readFileToString(new File("config.txt"),"utf-8");
    //解析文件
    JSONObject json = JSON.parseObject(classstr);
    //根据json对象创建对象
    return null;
}
}
