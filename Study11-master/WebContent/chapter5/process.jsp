<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 한글데이터를 받는 페이지에서 선언. 
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
	%>
	
	<p>이름 : <%= name %></p>
</body>
</html>