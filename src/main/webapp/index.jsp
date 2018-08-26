<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    WebApplicationContextUtils.getWebApplicationContext(application).getBean("stu");
    System.out.println("=========");
    System.out.println(request.getAttribute("stu"));
%>
</body>
</html>
