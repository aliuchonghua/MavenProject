package org.westos.web01.策略模式;

public class StrategyImpl implements  Strategy {

    @Override
    public void method1() {
        System.out.println("方法1的第二种实现");
    }

    @Override
    public void method2() {
        System.out.println("方法2的第二种实现");
    }
}
