<%--
  Created by IntelliJ IDEA.
  User: nhile
  Date: 25/10/2019
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String address="193 Nguyen Luong Bang"; //Dung ra la lay DB va truy cap vao DB de kiem thu username va password co dung hay ko?
    //Java co ban
    if("Chi pheo".equals(username) && (!"".equals(password))){
        //Thanh cong:Di ve trang welcome.jsp
        request.setAttribute("address", address);
        RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
        rd.forward(request, response);
    } else{
        //That bai: Di ve trang login.jsp
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

</body>
</html>
