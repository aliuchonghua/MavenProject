package org.westos.web01.适配器模式;

public class Client {
    public static void main(String[] args) {
        TargetAdapter t=new Adapter();
        t.method1();
        t.method2();
    }
}
