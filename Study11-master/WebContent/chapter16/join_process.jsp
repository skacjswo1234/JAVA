<%@page import="org.apache.catalina.connector.Response"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");	

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	// 커넥션 객체를 만든다.
	Connection conn = null;
	
	try {
						// 드라이버 연결 및 로딩
		Class.forName("org.mariadb.jdbc.Driver");	
		// DB 연결
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/JSPBookDB?user=root&password=koreait");
		
		Statement stmt = conn.createStatement();
		
		int row = stmt.executeUpdate("INSERT INTO member(id, pw, name) VALUES('" + id + "','" + pw + "','" + name + "')");
		if(row == 1){
			// 회원 가입 성공
			response.setStatus(Response.SC_CREATED);
		} else {
			// 회원 가입 실패
			response.setStatus(400);
		}
	} catch(ClassNotFoundException e) {
		// 예외처리
		response.setStatus(500);
	}
%>