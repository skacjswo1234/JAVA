<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// MultipartRequest 객체로 파일업로드방법
	
		MultipartRequest multi = new MultipartRequest(request, "C:\\upload", 5*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
		
		String title = multi.getParameter("title");
		
		Enumeration files = multi.getFileNames();
		String filename = (String) files.nextElement();
		
		filename = multi.getFilesystemName(filename);
		String original = multi.getFilesystemName(filename);

	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=title %></h3>
	<p>실제 파일 이름 : <%= original%></p>
	<p>저장 파일 이름 : <%= filename %></p>
</body>
</html>