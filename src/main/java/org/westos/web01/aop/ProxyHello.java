package org.westos.web01.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHello implements InvocationHandler {
    //需要传入的真实的对象
    private HelloInterface helloInterface;
    private AdviceInterface adviceInterface; //通知对象
    private PointCutInterface pointCutInterface; //在哪个方法中执行

    public ProxyHello(HelloInterface helloInterface, AdviceInterface adviceInterface, PointCutInterface pointCutInterface) {
        this.helloInterface = helloInterface;
        this.adviceInterface = adviceInterface;
        this.pointCutInterface = pointCutInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(pointCutInterface.canProxy(method)){
            this.adviceInterface.before(proxy,method,args);
        }
        Object result = method.invoke(helloInterface, args);
        if(pointCutInterface.canProxy(method)){
            this.adviceInterface.after(proxy,method,args);
        }
        return result;
    }
}
