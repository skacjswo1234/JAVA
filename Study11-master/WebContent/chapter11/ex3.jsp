<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%
	int su1 = Integer.parseInt(request.getParameter("su1"));
	int su2 = Integer.parseInt(request.getParameter("su2"));
	
	int result = su1 / su2;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>