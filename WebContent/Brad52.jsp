<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Taglib: forTokens -->
<%
	String line = "1:brad:0912-123456:台北市士林區";
	request.setAttribute("data", line);
%>
<c:forTokens items="${data }" delims=":" var="item">
${item }<br>
</c:forTokens>
Header
<hr>
<c:import url="import.txt" />
<hr>
Footer
<hr>
<c:catch>
	<c:import url="http://www.iii.org.tw" />
</c:catch>
<hr>
<c:url value="http://www.iii.org.tw" />
<c:redirect url="http://www.iii.org.tw" />



</body>
</html>