package org.westos.web01.代理模式;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试动态代理
 */
public class Client2 {
    public static void main(String[] args) {
        //需要代理的类,类型必须是接口
        Subject subject=new RealSubject();
        //获取一个代理类
        Subject proxySubject = (Subject) Proxy.newProxyInstance(
                //需要被代理的类的类加载器
                Subject.class.getClassLoader(),
                //需要被代理类的class
                new Class[]{Subject.class},
                //自己写的代理类InvocationHandler,里面是代理的方法
                new ProxyHandler(subject));
        //执行代理类中的方法
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
