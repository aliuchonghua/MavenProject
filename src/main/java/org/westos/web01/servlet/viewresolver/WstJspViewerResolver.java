package org.westos.web01.servlet.viewresolver;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/28.
 */
public class WstJspViewerResolver implements WstViewerResolver {
    @Override
    public void handle(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) {
        //将mv中的对象添加到request中
        Map<String, Object> model = mv.getModel();
        for(String key:model.keySet()){
            request.setAttribute(key,model.get(key));
        }
        //将请求forward到jsp中
        try {
            request.getRequestDispatcher(mv.getViewName()).forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
