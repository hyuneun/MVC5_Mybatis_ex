<%@page import="kr.co.model.SawonDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<th>사원번호</th><th>이름</th><th>부서명</th><th>직급</th>
	</tr>

	<c:forEach var="c" items="${data}">
	<tr>
		<td>${c.sawon_no }</td>
		<td>${c.sawon_name }</td>
		<c:if test="${c.buser_num == '10'}">
		<td>총무부</td>
		</c:if>
		<c:if test="${c.buser_num == '20'}">
		<td>영업부</td>
		</c:if>
		<c:if test="${c.buser_num == '30'}">
		<td>전산부</td>
		</c:if>
		<c:if test="${c.buser_num == '40'}">
		<td>관리부</td>
		</c:if>
		
		<td>${c.sawon_jik }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>