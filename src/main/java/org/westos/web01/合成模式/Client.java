package org.westos.web01.合成模式;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Component c1=new Leaf();
        Composite c2=new Composite();
        List<Component> list=new ArrayList<>();
        list.add(c1);
        c2.setComponentList(list);
        //执行
        c1.method1();
        System.out.println("-------------------------");
        c2.method1();
    }
}
