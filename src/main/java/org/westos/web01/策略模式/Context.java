package org.westos.web01.策略模式;

public class Context {
    private Strategy strategy;

    public void doSomething(){
        strategy.method1();
        strategy.method2();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
