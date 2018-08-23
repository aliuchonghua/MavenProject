package org.westos.web01.代理模式;

public class Client {
    public static void main(String[] args) {
        Subject subject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject();
        proxySubject.setSubject(subject);

        proxySubject.method1();
        System.out.println("-----------------");
        fun(subject);
        System.out.println("-----------------");
        fun(proxySubject);

    }
    public static void fun(Subject subject){
        subject.method1();
    }
}
