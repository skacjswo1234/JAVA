<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="process.jsp" method="get">
		<p>
			<label for="">독서</label>
			<input type="checkbox" id="reading" name="reading">
			
			<label>운동<input type="checkbox" name="exercise"></label>
			
			<label>영화<input type="checkbox" name="movie"></label>
		</p>
		<input type="submit" value="전송">
	</form>

</body>
</html>