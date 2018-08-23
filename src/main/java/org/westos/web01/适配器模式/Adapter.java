package org.westos.web01.适配器模式;

public class Adapter extends Adaptee implements TargetAdapter{
    @Override
    public void method2() {
        System.out.println("方法2的实现");
    }
}
