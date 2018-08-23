package org.westos.web01.代理模式;

public class ProxySubject implements Subject {
    private Subject subject;
    @Override
    public void method1() {
        System.out.println("方法执行前");
        subject.method1();
        System.out.println("方法执行后");
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
