<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String myIP = request.getRemoteAddr();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 페이지!</title>
</head>
<body>
	<center>
		<strong>!  SNS 서비스 ! </strong>
		<div>
			<form action="login">
				<strong>로그인</strong>
			<input type ="text" name ="id">
			<input type="password" name="pw">
			<input type="submit" value ="로그인">
				</form>
		
		</div>
		<div>
			<a href="join_1.jsp"><strong>회원가입</strong></a>
			<a><strong>비밀번호 찾기</strong></a>
		</div>
	</center>
</body>
</html>