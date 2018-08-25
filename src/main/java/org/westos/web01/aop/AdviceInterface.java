package org.westos.web01.aop;

import java.lang.reflect.Method;

public interface AdviceInterface {
    void before(Object proxy, Method method, Object[] args);
    void after(Object proxy, Method method, Object[] args);
}
