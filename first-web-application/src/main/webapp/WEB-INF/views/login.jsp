<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@include file="common/header.jspf" %>

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
<%@include file="common/navigation.jspf" %>
My first gay experience with ${name}
<form action="/login" method="post">
<p><font color="red">${errorMessage}</font></p>
 Username: <input type="text" name="username"/> Password: <input type="password" name="password"/> <input type="submit" value="Login"/>
</form>
</body>
<div>Current date is <%=date%></div>
</html>
<%@include file="common/footer.jspf" %>