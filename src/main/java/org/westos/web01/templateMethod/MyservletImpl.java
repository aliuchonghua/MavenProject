package org.westos.web01.templateMethod;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;

public class MyservletImpl extends AbstractServlet{
    @Override
    protected void doinit(ServletConfig var1) {
        System.out.println("doinit");
    }

    @Override
    protected void doservice(ServletRequest var1) {
        System.out.println("doservice");
    }
}
