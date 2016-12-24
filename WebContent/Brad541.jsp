<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<fmt:setLocale value="zh_TW"/>
<fmt:formatDate value="${now }"/><br>
<fmt:setLocale value="en"/>
<fmt:formatDate value="${now }"/><br>
<hr />
<fmt:setLocale value="zh"/>
<fmt:bundle basename="mesg">
	zh: <fmt:message key="hello" />, <fmt:message key="who" />
</fmt:bundle>
<hr />
<fmt:setLocale value="en"/>
<fmt:bundle basename="mesg">
	en: <fmt:message key="hello" />, <fmt:message key="who" />
</fmt:bundle>
<hr />
<fmt:setLocale value="zh_TW"/>
<fmt:bundle basename="mesg">
	zh_TW: <fmt:message key="hello" />, <fmt:message key="who" />
</fmt:bundle>
<hr />
<c:set var="name" value="${param.name}" />
<c:set var="x" value="${param.x}" />
<c:set var="y" value="${param.y}" />
<c:set var="r" value="${param.x + parm.y}" />

<fmt:bundle basename="mesg">
	<fmt:message key="hello" />, <fmt:message key="who" /><br />
	<fmt:message key="str1">
		<fmt:param value="${name }" />
		<fmt:param value="${x }" />
		<fmt:param value="${y }" />
		<fmt:param value="${r }" />
	</fmt:message>
</fmt:bundle>


</body>
</html>