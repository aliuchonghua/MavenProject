package org.westos.web01.aop;

import java.lang.reflect.Method;

public class MyAdvice implements AdviceInterface {

    @Override
    public void before(Object proxy, Method method, Object[] args) {
        System.out.println("方法执行前01");
    }

    @Override
    public void after(Object proxy, Method method, Object[] args) {

        System.out.println("方法执行后01");
    }
}
