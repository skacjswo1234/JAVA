<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- HTML FORM은 GET, HOST 두가지방식으로 보낸다  -->
		<!-- GET : 요청 파라미터를 URL에 담아서 전달/ 사용자가 서버로 보낼데이터인 입력한 값이 그대로 노출 전송속도가 빠름, 
		전송할 수 있는 데이터의 크기제한이 있음 4,086Byte -->
		<!--   POST : 요청파라미터를 HTPP프로토콜의 Header에 담아서 전달 사용자가 보내는 
		값이 어떤 값인지 보이지 않음 보완에 완벽한  전송방식은 아님 상대적으로 전송속도가 느림, 전송할 수 있는 데이터의 크기 제한이 없음-->
									<!-- 전송방식선택 -->					
		<form action="process.jsp" method="post">
			<p>
				이름 : <input type="text" name="name">
					  <input type="date" name="date">
					  <input type="submit" value="전송">
			</p>
		</form>
</body>
</html>