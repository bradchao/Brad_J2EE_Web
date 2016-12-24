<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<jsp:useBean id="now" class="java.util.Date"/>
<sql:setDataSource dataSource="jdbc:mysql://localhost/mydb,com.mysql.jdbc.Driver,root,root"/>
<sql:transaction>
	<sql:update var="n" 
		sql="insert into member (account,passwd,birthday,type) values (?,?,?,2)">
		<sql:param value="kkk" />
		<sql:param value="yyy" />
		<sql:dateParam value="${now }" type="date" />
	</sql:update>	
	<sql:query var="lastid">select last_insert_id() as newid</sql:query>

</sql:transaction>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${n >= 1}">
	${lastid.rows[0].newid }
</c:if>
</body>
</html>