package org.westos.web01.servlet.handleradapter;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 执行bean中的方法
 * Created by Administrator on 2018/8/28.
 */
public interface WstHandlerAdapter {

    /**
     *运行控制器
     * @param controller  url具体需要执行的controller对象
     * @param request
     * @param response
     * @return
     */
    ModelAndView handle(Object controller, HttpServletRequest request, HttpServletResponse response) throws Exception;

    /**
     * 检查对象是否可以使用handler执行
     * @param controller
     * @return
     */
    boolean canHandle(Object controller);
}
