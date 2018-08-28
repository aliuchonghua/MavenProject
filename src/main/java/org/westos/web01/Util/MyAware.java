package org.westos.web01.Util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2018/8/25.
 */
//在web.xml中初始化了Spring之后spring在加载完成之后就会自动加载实现ApplicationContextAware的类中的setApplicationContext方法/
public class MyAware implements ApplicationContextAware {
//    在spring中也需要添加MyAware的bean,spring在加载他的时候如果检查到这个类是Aware就会自动执行set方法

    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
