<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scripting</title>
</head>
<body>
	<!-- 선언문 메서드 나 변수 선언가능 -->
	<%!
		int count = 3;
	
	String makeItLower(String str){
		return str.toLowerCase();
	}
	%>
	<!-- 스크립틀릿 자바 로직 코드를 작성 -->
	<%
		for(int i=1; i<=count; i++){
			out.println("Java Server Pages" + i + ".<br>");
		}
	%>
	<!-- 표현문은 문자열로 출력 -->
	<%=makeItLower("Hello World") %>
</body>
</html>