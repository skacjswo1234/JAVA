<%@page import="chapter4.Person"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="person" class="chapter4.Person"/>
<jsp:setProperty property="id" name="person" param="id"/>
<jsp:setProperty property="name" name="person" param="name"/>

<% 
// 	String id = request.getParameter("id");
// 	String name = request.getParameter("name");
	
// 	person.setId(Integer.parseInt(id));
// 	person.setName(name);	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>아이디 : <%=person.getId()%></p>
	<p>이름 : <%=person.getName() %></p>
</body>
</html>