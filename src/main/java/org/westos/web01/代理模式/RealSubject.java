package org.westos.web01.代理模式;

public class RealSubject implements Subject {
    @Override
    public void method1() {
        System.out.println("Subject的具体实现");
    }
}
