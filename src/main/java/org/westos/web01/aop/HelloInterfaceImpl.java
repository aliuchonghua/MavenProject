package org.westos.web01.aop;

public class HelloInterfaceImpl implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello,word");
    }

    @Override
    public void sayHi() {
        System.out.println("say:hi");
    }
}
