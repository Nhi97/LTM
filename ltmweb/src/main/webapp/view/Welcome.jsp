<%--
  Created by IntelliJ IDEA.
  User: nhile
  Date: 25/10/2019
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h1> Welcome</h1>
<%
    String username = request.getParameter("username");
    String temp = (String) session.getAttribute("temp");
    String address = (String) request.getAttribute("address");
%>
Welcome: <%=username %><br/>
Address: <%=address %><br/>
Temp: <%=temp %><br/>
</body>
</html>
