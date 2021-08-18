<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 클라이언트가 보내주는 모든 쿠키를 가져옴
	Cookie[] cookies = request.getCookies();
	
	for(Cookie cookie : cookies) {
		String name = cookie.getName();
		
		if(name.equals("ID") || name.equals("PW") || name.equals("nickname")){
			//쿠키의 타이머(유효시간)을 0초로 설정
			cookie.setMaxAge(0);
			// 타이머가 다 된 쿠키를 클라이언트에게 보냄
			// (클라이언트는 타이머가 다 된 쿠키를 받으면 삭제 처리를 함)
			response.addCookie(cookie);
		} // end if
	} // end for	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<strong>로그아웃이 되었습니다.</strong>
	
	<br>
	
	<a href="/JSPBook01/chapter14/login.jsp">로그인 페이지로...</a>
</body>
</html>