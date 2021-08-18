<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	/* DB에 select, insert, update, delete 를 하기위한 준비 / DB 연결하기
		1. 쿼리를 수행할 Connection객체 생성 (12번 쨰 줄)
		2. 연결을 수행할 Driver 로딩 (15번 째 줄)
		3. DBMS와 연결 (18번째줄)
		4. 쿼리 전송
		5. DB 연결 헤제 (32 ~ 38번 째 줄)
	*/
	Connection conn = null;
	
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		// DB사용법1							// DB이름		 // 주소  // 포트번호 // DB	
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/JSPBookDB?user=root&password=koreait");
	/* 	
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/JSPBookDB","root", "koreait");
		// DB사용법2
		Properties props = new Properties();
		props.put("user","root");
		props.put("password","1234");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/JSPBookDB",props); 
	*/
		
		out.println("<h1>DB 접속에 </h1>");
		out.println("<h1>성공했습니다.</h1>");
		out.println("<h1>짝짝짝~!</h1>");
	} catch (Exception e) {
		e.printStackTrace();
		
		out.println("<h1>DB 접속에 </h1>");
		out.println("<h1>실패했습니다.</h1>");
		out.println("<h1>이클립스 콘솔을 확인하세요.</h1>");
	//finally로 NullPointerException 설정은 Not Null로 설정해준다.
	} finally{
		if(conn != null){
			try{
				conn.close();
				
				out.println("<h2>연결을 성공적으로 끊었습니다</h2>");
			} catch(SQLException e){
				e.printStackTrace();
				
				out.println("<h2>연결을 끊지 못했습니다.</h2>");
				out.println("<h2>이클립스 콘솔을 확인하세요.</h2>");
			}	
		}
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>