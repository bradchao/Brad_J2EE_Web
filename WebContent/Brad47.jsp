<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= pageContext.getAttribute("pageKey") %><br>
<%= request.getAttribute("reqKey") %><br>
<%= session.getAttribute("sessionKey") %><br>
<%= application.getAttribute("appKey") %><br>
<hr>
Method: ${pageContext.request.method}<br>
QueryString: ${pageContext.request.queryString}<br>
IP: ${pageContext.request.remoteAddr}<br>


</body>
</html>