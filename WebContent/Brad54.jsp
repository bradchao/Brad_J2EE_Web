<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="zh"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date now = new Date();
	pageContext.setAttribute("now", now);
%>
<fmt:requestEncoding value='utf-8'/>
<fmt:setLocale value="zh_TW"/><fmt:formatDate value="${now }"/><br>
<fmt:setLocale value="zh_CN"/><fmt:formatDate value="${now }"/><br>
<fmt:setLocale value="ja"/><fmt:formatDate value="${now }"/><br>
<fmt:setLocale value="en"/><fmt:formatDate value="${now }"/><br>

<fmt:setLocale value="zh_TW"/>
<fmt:setBundle basename="mesg_zh_TW" var="zh" />
<fmt:setBundle basename="mesg_en" var="en" />
<fmt:message key="hello" bundle="${en }"/>, <fmt:message key="who" bundle="${zh }"/>

</body>
</html>