<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.whpu.service.stock.spam.service.ITestService" %>
<%--
  Created by IntelliJ IDEA.
  User: Niuys
  Date: 16/1/4
  Time: 下午9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<%
  try {
    ServletContext context = request.getSession().getServletContext();
    ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
    ITestService alertBiz = (ITestService)ctx.getBean("testService");
    alertBiz.test();
    out.println("ok");
  } catch (Exception e) {
  }
%>
</body>
</html>
