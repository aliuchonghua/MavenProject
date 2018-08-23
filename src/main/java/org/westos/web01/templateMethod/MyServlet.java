package org.westos.web01.templateMethod;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
//模板方法模式
public interface MyServlet {
    void init(ServletConfig var1) throws SecurityException;

    void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;
}
