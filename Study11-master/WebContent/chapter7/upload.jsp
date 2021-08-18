<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	// 파일 업로드 
	<form method="post" enctype="multipart/form-data" action="process.jsp">
		<p>제목 : <input type="text" name="title"></p>
		<p>파일 : <input type="file" name="file"></p>
		<p><input type="submit" value="업로드"></p>
	</form>
</body>
</html>