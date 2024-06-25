<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is the project home page</h1>
<h2> Hello JSP and Servlet</h2>
<p> This is the learning phase of jsp and Servlet. </p>

<%= new Date().toLocaleString() %>
<br>
<a href = "login">Login Servlet</a>

</body>
</html>