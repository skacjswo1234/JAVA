<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id"); // 아이디
	String password = request.getParameter("password"); // 비밀번호
	String password2 = request.getParameter("password2"); //비밀번호 확인
	
	if(password.equals(password2) == false){
		response.sendRedirect(password);
	}
	
//	String hobby1 = request.getParameter("hobby1"); 	//취미1
	String[] hobby = request.getParameterValues("hobby"); // 취미(독서,운동,영화)
	String hobbys ="";
	for(String h : hobby) {
		hobbys +=( h + ",");
	}
	
	String comment =request.getParameter("comment"); //가입인사
	comment = comment.replace("\n", "<br>");
	
	//...
	String name = request.getParameter("name"); 
	String phone1 = request.getParameter("phone1");
	String gender = request.getParameter("gender");
	String hobby1 = request.getParameter("hobby1");
	String hobby2 = request.getParameter("hobby2");
	String hobby3 = request.getParameter("hobby3");


%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>ID <strong>: </strong><%=id %></p>
	<p>PASSWORD<strong> :</strong> <%=password %></p>
	<p>이름 <strong>:</strong> <%=name %></p>
	<p>연락처<strong> :</strong> <%=phone1 %></p>
	<p>성별 <strong>:</strong> <%= gender %></p>
	<p>취미<strong> :</strong><%= hobby %><%= hobbys %></p>
	<%
		for(String h : hobby) {
			out.println(h+",");
		}
	%>
	<p><strong>가입인사 :</strong> <%= comment %></p>
	
</body>
</html>