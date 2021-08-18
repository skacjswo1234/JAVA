<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	// !요청 파라미터의 이름을 전부 가져옴! 
	Enumeration<String> names = request.getParameterNames();
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<!-- <tr>은 행을 구성하는 것이다. -->
	<tr>
		<th>요청 파라미터의 이름</th>
		<th>요청 파라미터의 값</th>
	</tr>
	
	<tr>
	
	<%
		// names = ["파라미터이름1","파라미터이름2"...,"파라미터이름N"]
			//hasMoreElements : names가 다음 포인터에 가리키는것이 있는지
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = request.getParameter(name);
			out.println("<td>" + name + "<td>");
			out.println("<td>" + value + "<td>");
			// 요청 파라미터의 이름을 사용해서
			// 요청 파라미터의 값을 출력하세요
			out.println("<td>요청 파라미터의 값</td>");
			
			out.println("</tr>");
		}
	
	%>
	</tr>
</table>
</body>
</html>