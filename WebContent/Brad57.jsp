<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>   
<%@ page import="com.oreilly.servlet.*" %>   

<%
	String uploadPath = pageContext.getServletContext().getInitParameter("upload-path");
	
	MultipartRequest mr = new MultipartRequest(request,uploadPath);
	String fn = mr.getFilesystemName("upload");
	System.out.println(fn);
%>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>