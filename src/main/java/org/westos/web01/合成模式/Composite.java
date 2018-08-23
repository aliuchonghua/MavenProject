package org.westos.web01.合成模式;

import java.util.List;

/**
 * 合成模式中的接口的实现
 */
public class Composite implements Component{
    private List<Component> componentList;
    @Override
    public void method1() {
        System.out.println("Composite中的method1");
        for (Component c:componentList){
            c.method1();
        }
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }
}
