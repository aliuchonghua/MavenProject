package org.westos.web01.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 该程序用于对注解进行演示其中@MyDocumentAnno注解可以包含在程序文档中
 * @author westos
 * @see MyDocumentAnno
 * Created by Administrator on 2018/8/26.
 */
@Component("mydocument")
public class MyDocument {

    @MyDocumentAnno(key = "westos",value = "java")

    private String name;

    public String getName() {
        return name;
    }

    @Value("${user}")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyDocument{" +
                "name='" + name + '\'' +
                '}';
    }
}
