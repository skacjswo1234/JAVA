<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%

	Locale locale = request.getLocale();
	
	String displayLanguage = locale.getDisplayLanguage(); // 로케일언어
	String language = locale.getLanguage(); // 언어 코드
	String displayCountry = locale.getDisplayCountry(); //국가 
	String country = locale.getCountry(); // 국가 코드
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>로케일 언어 :  <%=displayLanguage %></p>
	<p>로케일 언어 코드 : <%=language %></p>
	<p>로케일 국가 : <%=displayCountry %></p>
	<p>로케일 국가 코드 : <%=country %></p>
	<p></p>
</body>
</html>