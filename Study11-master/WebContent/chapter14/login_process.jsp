<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!--  -->

<%
	String userID = "user";

	String userPW = "pw";
	
	String userNickname = "사용자";
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// 회원가입 되어있는 아이디와 비밀번호를
	// 사용자가 보내는 아이디와 비밀번호 비교해서
	if(id.equals(userID) && pw.equals(userPW)){
		// 같다면
		// 아이디 비밀번호 닉네임 을 저장하는 쿠키 생성
		Cookie cookie1 = new Cookie("ID", id);
		Cookie cookie2 = new Cookie("PW", pw);
		Cookie cookie3 = new Cookie("nickName", userNickname);
		
		// 2. 클라이언트 쿠키 전잘
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		// 3. 200 응답 코드를 반환
		response.setStatus(200);
	} else {
		// 다르다면
		// 1.400번대 응답 코드를 반환
		response.setStatus(400);
	}
%>
