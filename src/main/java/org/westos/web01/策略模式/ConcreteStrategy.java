package org.westos.web01.策略模式;

public class ConcreteStrategy implements Strategy {
    @Override
    public void method1() {
        System.out.println("方法1的实现");
    }

    @Override
    public void method2() {
        System.out.println("方法2的实现");
    }
}
