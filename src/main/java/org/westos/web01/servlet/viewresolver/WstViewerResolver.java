package org.westos.web01.servlet.viewresolver;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/8/28.
 */
public interface WstViewerResolver {

    void handle(ModelAndView mv, HttpServletRequest request, HttpServletResponse response);
}
