<%@page import="kr.co.model.GogekDTo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 상품 자료 **<br>
<table border = "1">
	<tr>
		<th>번호</th><th>이름</th><th>전화</th><th>성별</th>
	</tr>

	<c:forEach var="s" items="${data }">
	<tr>
		<td>${s.gogek_no }</td>
		<td>${s.gogek_name }</td>
		<td>${s.gogek_tel }</td>
		<td>${s.gogek_jumin }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>