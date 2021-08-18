<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contentType = request.getParameter("contentType");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(contentType.equals("html")){
%>
	<strong>HTML은 웹페이지를 만드는 언어입니다.</strong>
	<p>그러나 HTML은 웹 페이지를 동적으로...</p>
	<p>사용자의 요청에 따라 웹 페이지를 구성할 수는 없습니다.</p>
	<p>그래서 HTML을 정적인 웹페이지 언어라고 합니다.</p>
<%		
	} else if(contentType.equals("css")) {
%>
	<strong>CSS는 웹페이지의 디자인을 만드는 언어입니다.</strong>
	<p>HTML로 뼈대를 잡고 CSS로 디자인을 입힙니다.</p>
<% 		
	} else if(contentType.equals("js")){
%>
	<strong>JavaScript는 웹페이지에 움직임을 줄 수 있는 언어입니다.</strong>
	<p>HTML을 동적으로 만든다기 보다는...HTML로 보여주는 이미지를 움직이게 만들거나</p>
	<p>사용자의 이벤트(클릭, 드래그, 키 입력)를 감지해서</p>
	<p>그에 따라 정적인 HTML에 애니매이션을 줄 수 있습니다.</p>
<% 		
	} else {
%>
	<strong>HTML은 웹페이지를 만드는 언어입니다.</strong>
	<p>그러나 HTML은 웹 페이지를 동적으로...</p>
	<p>사용자의 요청에 따라 웹 페이지를 구성할 수는 없습니다.</p>
	<p>그래서 HTML을 정적인 웹페이지 언어라고 합니다.</p>
	<hr>
	<strong>CSS는 웹페이지의 디자인을 만드는 언어입니다.</strong>
	<p>HTML로 뼈대를 잡고 CSS로 디자인을 입힙니다.</p>
	<hr>
	<strong>JavaScript는 웹페이지에 움직임을 줄 수 있는 언어입니다.</strong>
	<p>HTML을 동적으로 만든다기 보다는...HTML로 보여주는 이미지를 움직이게 만들거나</p>
	<p>사용자의 이벤트(클릭, 드래그, 키 입력)를 감지해서</p>
	<p>그에 따라 정적인 HTML에 애니매이션을 줄 수 있습니다.</p>
<% 		
	}
%>

</body>
</html>