<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%! int a = 0; %>
<% int b = 0; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><% out.print("Brad Big Company"); %></h1>
現在日期: <%= Calendar.getInstance().get(Calendar.YEAR) %><br />
出樂透: <%= (int)(Math.random()*49+1) %><br>
a: <%= a++ %><br>
b: <%= b++ %><br>
</body>
</html>