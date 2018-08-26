package org.westos.web01.IOC模型;

public class A {
    private AInterface a;

    public void dosomething(){
        a.method1();
    }

    public AInterface getA() {
        return a;
    }

    public void setA(AInterface a) {
        this.a = a;
    }
}
