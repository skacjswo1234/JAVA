<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>
	<strong>로그인을 한 사용자만 볼 수 있는 페이지입니다</strong>
	
	
	<!-- 
		아래 경로에 있는 서블릿을 사용해서 로그아웃 처리를 하세요
		1. 세션에 들어있는 isLogin을 false로만든다.
		2. 세션에 들어있는 nickname을 삭제한다.
		3. 로그인 페이지로 이동한다.
	
	 -->
	
	<a href="/JSPBook01/session/logout">로그아웃</a>
</body>
</html>