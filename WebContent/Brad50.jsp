<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="tw.brad.j2ee.beans.Member" />

<jsp:setProperty property="id" name="member" value="1"/>
<jsp:setProperty property="name" name="member" value="<%= request.getParameter(\"account\") %>"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello, <jsp:getProperty property="name" name="member"/>
</body>
</html>