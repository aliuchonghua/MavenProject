package org.westos.web01.aop;

import java.lang.reflect.Method;

public interface PointCutInterface {
    //用于检查我们的方法是否需要执行动态代理
    boolean canProxy(Method method);
}
