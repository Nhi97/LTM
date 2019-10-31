<%--
  Created by IntelliJ IDEA.
  User: nhile
  Date: 25/10/2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGIN</title>
</head>
<body>

<%

    String temp= "Chí Phèo";
    session.setAttribute("temp",temp);


%>
<form action="${pageContext.request.contextPath}/login" method="post">
    username: <input type="text" name="username">
    password: <input type="password" name="password">
    <button type="submit" value="OK">OK</button>
    <button type="reset" value="Reset">Reset</button>
</form>
</body>
</html>
