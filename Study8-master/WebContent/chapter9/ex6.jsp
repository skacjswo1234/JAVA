<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>기본 로케일</h1>
	<!-- 리소스 번들 페이지를 불러오는 코드  -->
	<fmt:setBundle basename="properties.myBundle" var="resourceBundle"/>
	<p>제목 : <fmt:message key="title" bundle="${resourceBundle }"/></p>
	<p>이름 : <fmt:message key="username" bundle="${resourceBundle }"/></p>
</body>
</html>