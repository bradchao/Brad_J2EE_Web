<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource dataSource="jdbc:mysql://localhost/mydb,com.mysql.jdbc.Driver,root,root"/>

<sql:query var="result" sql="select * from member" startRow="7" maxRows="4"/>
<sql:query var="result2">
select * from member where id > 20
</sql:query>
<!-- 
	result 有以下屬性:
	rows : 查詢出來的結果資料集
	rowsByIndex : 以數字索引的查詢結果
	columnNames : 欄位名稱
	rowCount : 查詢的資料筆數
	limitedByMaxRows : 取出最大資料筆數限制
 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
共有: ${result.rowCount}筆資料<hr>
<c:forEach items="${result.rows }" var="row">
${row.id }:${row.account }<br>
</c:forEach>
<hr>
<c:forEach items="${result.rowsByIndex }" var="row">
${row[0] }:${row[1] }<br>
</c:forEach>
<hr>
</body>
</html>