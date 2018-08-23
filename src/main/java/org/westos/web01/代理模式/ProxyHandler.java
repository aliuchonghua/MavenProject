package org.westos.web01.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * java下的动态代理
 */
public class ProxyHandler implements InvocationHandler {
    private Object realsubject;

    public ProxyHandler(Object realsubject) {
        this.realsubject = realsubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法前");
        Object invoke = method.invoke(realsubject, args);
        System.out.println("方法后");
        return invoke;
    }
}
