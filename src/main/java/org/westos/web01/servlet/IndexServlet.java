package org.westos.web01.servlet;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.westos.web01.Util.MyAware;
import org.westos.web01.servlet.handleradapter.WstHandlerAdapter;
import org.westos.web01.servlet.handlermapping.WstHandlerMapping;
import org.westos.web01.servlet.viewresolver.WstViewerResolver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/26.
 */
//@Controller

//通过注解配置Servlet
@WebServlet(name = "indexServlet",urlPatterns="*.wst")
public class IndexServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取输入的uri
        String uri = request.getRequestURI();
//        获取contextpath
        String path = request.getContextPath();
        if(!StringUtils.isEmpty(path)){
//            如果path不为空则进行替换
            uri = uri.replaceFirst(path, "");
        }
        WstHandlerMapping wstHandlerMapping = MyAware.getContext().getBean(WstHandlerMapping.class);
        Object bean = wstHandlerMapping.getBean(uri);
        //根据url获取bean
        //Controller bean = MyAware.getContext().getBean(uri, Controller.class);
//        执行bean获取返回值
        ModelAndView mv = null;
        //不同的类型调用不同的方法执行
        //找到所有可以使用的handler
        Map<String, WstHandlerAdapter> handlers = MyAware.getContext().getBeansOfType(WstHandlerAdapter.class);
        //遍历
        WstHandlerAdapter handler=null;
        for(String key:handlers.keySet()){
            //根据bean检查对应的handler是否匹配
            if(handlers.get(key).canHandle(bean)){
                handler=handlers.get(key);
                break;
            }
        }
        try {
            //instanceof判断是否是该类的实例
           /* if (bean instanceof Controller){
            mv = ((Controller)bean).handleRequest(request, response);
            }*/
           mv=handler.handle(bean,request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*request.setAttribute("mv",mv);
        request.getRequestDispatcher(mv.getViewName()).forward(request,response);*/
        //视图处理
        WstViewerResolver wstViewerResolver1=MyAware.getContext().getBean(WstViewerResolver.class);
        wstViewerResolver1.handle(mv,request,response);
    }




}
