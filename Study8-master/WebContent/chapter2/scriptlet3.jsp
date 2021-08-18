<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tag</title>
</head>
<body>
	<!--  HTML 주석 -->
	<%--  JSP 주석 --%>
	<%
		for (int i=2; i<=9; i++){
			out.println("<h1>" + i + "단</h>");
				for(int j=1; j<=9; j++){
					out.println( i + "x" + j + "=" + (i*j) +"<br>");
				}
			}
	%>
</body>
</html>