package org.westos.web01.代理模式;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client2 {
    public static void main(String[] args) {
        Subject subject=new RealSubject();
        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new ProxyHandler(subject));
        proxySubject.method1();


        System.out.println("-------------");

        Map map=new HashMap();
        Map proxyMap = (Map) Proxy.newProxyInstance(Map.class.getClassLoader(),
                new Class[]{Map.class},
                new ProxyHandler(map));
        proxyMap.put("msg",1);
        System.out.println(map);
    }
}
