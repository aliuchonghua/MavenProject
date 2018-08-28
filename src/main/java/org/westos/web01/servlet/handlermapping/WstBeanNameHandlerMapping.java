package org.westos.web01.servlet.handlermapping;


import org.westos.web01.Util.MyAware;

/**
 * view解析的具体实现
 * Created by Administrator on 2018/8/28.
 */
public class WstBeanNameHandlerMapping implements WstHandlerMapping {
    @Override
    public Object getBean(String url) {
        Object bean = MyAware.getContext().getBean(url);
        return bean;
    }
}
