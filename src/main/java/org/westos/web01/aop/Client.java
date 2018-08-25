package org.westos.web01.aop;

import org.westos.web01.代理模式.ProxyHandler;

import java.lang.reflect.Proxy;
//代理模式
public class Client {
    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloInterfaceImpl();
        //必须是代理一个接口
        HelloInterface proxy = (HelloInterface) Proxy.newProxyInstance(
                //接口的类加载器
                HelloInterface.class.getClassLoader(),
                //接口的class字节码文件
                new Class[]{HelloInterface.class},
                //代理类对象
                new ProxyHello(helloInterface,new MyAdvice()));
        proxy.sayHello();
        proxy.sayHi();
    }
}
