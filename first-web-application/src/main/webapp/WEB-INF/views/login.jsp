<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.do</title>
</head>
<%
Date date = new Date();
System.out.println(date.toString());
%>
<body>
My first gay experience with ${name}
<form action="/login.do" method="post">
 Username: <input type="text" name="username"/> Password: <input type="password" name="password"/> <input type="submit" value="Login"/>
</form>
</body>
<div>Current date is <%=date%></div>
</html>