package org.westos.web01.spring;

import org.westos.web01.IOC模型.A;
import org.westos.web01.IOC模型.AInterface;
import org.westos.web01.IOC模型.AInterfaceImpl1;
import org.westos.web01.Util.SpringUtil;


/**
 * Created by Administrator on 2018/8/23.
 */
public class Client {
    public static void main(String[] args) {
        A a=(A) SpringUtil.getInstance().getBean("aobj");
        a.dosomething();

        System.out.println("---------------");
        A aa=new A();
        AInterface a1=new AInterfaceImpl1();
        aa.setA(a1);
        aa.dosomething();
    }
}
