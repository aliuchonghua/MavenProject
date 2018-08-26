package org.westos.web01.servlet;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.westos.web01.Util.MyAware;
import org.westos.web01.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/8/26.
 */
@WebServlet(name = "indexServlet",urlPatterns="/indexServlet")
@Controller
public class IndexServlet extends HttpServlet implements ApplicationContextAware {
    private ApplicationContext context;

    @Autowired
    private Student student;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("stu", MyAware.getContext().getBean("stu"));
        //SpringUtil.getInstance().getBean("stu");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
