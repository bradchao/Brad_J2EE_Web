<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.brad.j2ee.beans.*" %>
<jsp:useBean id="member2" class="tw.brad.j2ee.beans.Member" />
<jsp:setProperty property="id" name="member2" value="2"/>
<jsp:setProperty property="name" name="member2" value="Fox"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Member member = new Member();
	member.setId("1"); member.setName("Brad");
	out.print(member.getId() + ":" + member.getName());
%>
<hr>
<jsp:getProperty property="id" name="member2"/>:
<jsp:getProperty property="name" name="member2"/>
<hr>
${member2.name }<br>
${10 / 3 }<br>



</body>
</html>