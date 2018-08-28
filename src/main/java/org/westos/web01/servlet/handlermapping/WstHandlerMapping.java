package org.westos.web01.servlet.handlermapping;

/**
 * 根据url获取对应的bean
 * Created by Administrator on 2018/8/28.
 */
public interface WstHandlerMapping {

    Object getBean(String url);
}
