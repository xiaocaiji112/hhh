<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2021/11/30
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<%
    HashMap hashMap = new HashMap();
    System.out.println("hello jsp");
    String h = "hellojsp";
%>
<h1><%=h%></h1>
</body>
</html>
