<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("pageKey", "pageValve");
	request.setAttribute("reqKey", "reqValve");
	session.setAttribute("sessionKey", "sessionValve");
	application.setAttribute("appKey", "appValve");
%>
<jsp:forward page="Brad47.jsp"/>
</body>
</html>