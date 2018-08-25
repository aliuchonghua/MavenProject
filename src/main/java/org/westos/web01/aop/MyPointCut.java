package org.westos.web01.aop;

import java.lang.reflect.Method;
import java.util.List;


public class MyPointCut implements PointCutInterface {
    //需要执行动态代理的方法的名单,名单内的方法需要执行动态代理
    private List<String> methodlist;

    public List<String> getMethodlist() {
        return methodlist;
    }

    public void setMethodlist(List<String> methodlist) {
        this.methodlist = methodlist;
    }


    @Override
    public boolean canProxy(Method method) {
        String methodname=method.getName();
        methodname=method.getDeclaringClass().getName()+"."+methodname;
        return methodlist.contains(methodname);
    }
}
