<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="common/header.jspf" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<%
Date date = new Date();
System.out.println(date.toString());
%>
<body>
<%@include file="common/navigation.jspf" %>
Welcome ${username} <BR/>
Now, you can <a href="/list-todos"> manage your todos</a>
</body>
<div>Current date is <%=date%></div>
</html>
<%@include file="common/footer.jspf" %>

<!-- Valid User -> welcome.jsp -->
<!-- Invalid User -> login.jsp -->