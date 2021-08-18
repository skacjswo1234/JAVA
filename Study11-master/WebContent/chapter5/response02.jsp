<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 캐싱 - 클라이언트가 최로로 필요한 데이터를 서버로요청 최로로 요처하고 서버가 전달한 데이터를 캐시에 저장
	// 100
	// 200 - 
	// 300 - 사용자의 요청을 처리했으나 사용자가 요청한 데이터가 이동하였음
	// 400 - 
	// 500 - 
	response.setHeader("Cache-control","use_cache");
	
	response.setHeader("contentType", " text/html; charset=utf-8");
	response.setContentType(" text/html; charset=utf-8");
	response.setCharacterEncoding("UTF-8");
	
	response.setDateHeader("date",System.currentTimeMillis());
	%>
	
	Cache-control : <%=response.getHeader("Cache-control") %>
	contentType : <%=response.getHeader("contentType") %>
	date : <%=response.getHeader("date") %>
</body>
</html>