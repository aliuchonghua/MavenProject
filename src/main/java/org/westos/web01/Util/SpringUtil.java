package org.westos.web01.Util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用单例模式初始化spring
 */
public class SpringUtil {
    private static SpringUtil instance;
    private ApplicationContext context;

    private SpringUtil() {
        String filename = "spring.xml";
        //初始化spring
        context = new ClassPathXmlApplicationContext(filename);
    }

    public static SpringUtil getInstance() {
        if (instance == null) {
            instance = new SpringUtil();
        }
        return instance;
    }

    public Object getBean(String name) {

        return context.getBean(name);
    }
}
