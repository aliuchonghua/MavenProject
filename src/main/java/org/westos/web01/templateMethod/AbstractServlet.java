package org.westos.web01.templateMethod;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public abstract class AbstractServlet implements MyServlet {
    @Override
    public void init(ServletConfig var1) throws SecurityException {
        System.out.println("基本逻辑");
        doinit(var1);
        System.out.println("另一些逻辑");
    }

    protected abstract void doinit(ServletConfig var1);


    @Override
    public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
        System.out.println("基本逻辑");
        doservice(var1);
        System.out.println("另一些逻辑");
    }

    protected abstract void doservice(ServletRequest var1);
}
