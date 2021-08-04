<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:if test="${member != null}">
			<li><a href="/">일반 화면 </a></li>
			<li><a href="/member/signout">로그아웃</a></li>
		</c:if>
	</ul>
</body>