package org.westos.web01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class abs {
    public String aa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h3>this is aa </h3>");
        return "aa";
    }
}
