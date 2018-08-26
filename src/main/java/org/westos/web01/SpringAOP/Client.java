package org.westos.web01.SpringAOP;

import org.westos.web01.Util.SpringUtil;
import org.westos.web01.aop.HelloInterface;

public class Client {
    public static void main(String[] args) {
//        代理时候只能代理一个接口
//        具体的实现类在Spring中配置
        HelloInterface hello = (HelloInterface) SpringUtil.getInstance().getContext().getBean("helloInterface");
        hello.sayHello();
        hello.sayHi();

    }
}
