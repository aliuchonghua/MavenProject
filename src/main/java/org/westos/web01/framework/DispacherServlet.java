package org.westos.web01.framework;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet(name = "DispacherServlet")
public class DispacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // response.getWriter().println("<h1>Hello</1>");
        //获取uri
        String uri = request.getRequestURI();
        String path = request.getContextPath();
        if (!StringUtils.isEmpty(path)) {
            //如果有项目名就去除项目名
            uri = StringUtils.substringAfterLast(uri, path);
        }
        //分割
        String[] split = uri.split("/");
        String classname = split[1];
        String methodname = split[2];
        //从.wst出现位置向前截取
        methodname = StringUtils.substringBefore(methodname, ".wst");
        //改为全路径
        classname = "org.westos.web01.controller." + classname;
        System.out.println("classname:" + classname);
        System.out.println("methodname:" + methodname);

        try {
            //创建类的实例
            Class<?> cls = Class.forName(classname);
            Object obj = cls.newInstance();
            //查找类中的方法
            Class[] classes = new Class[2];
            classes[0] = HttpServletRequest.class;
            classes[1] = HttpServletResponse.class;
            //参数中第一个是方法名,后面的是参数类型的Class形式
            Method m1 = obj.getClass().getMethod(methodname, classes);
            //执行类的方法,参数一是该类的实例,后面的参数是执行该方法需要的参数
            Object result = m1.invoke(obj, new Object[]{request, response});
            //打印返回值
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("方法获取执行异常");
        }
    }
}