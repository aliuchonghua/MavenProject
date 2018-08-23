package org.westos.web01.策略模式;

public class Client {
    public static void main(String[] args) {
        //定义具体的策略对象
        Strategy s1=new ConcreteStrategy();
        Strategy s2=new StrategyImpl();
        //策略对象的使用类
        Context ctx=new Context();
        ctx.setStrategy(s1);
        ctx.doSomething();

        //使用第二个策略
        ctx.setStrategy(s2);
        ctx.doSomething();
    }
}
