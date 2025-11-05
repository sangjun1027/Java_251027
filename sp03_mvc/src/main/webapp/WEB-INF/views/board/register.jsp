<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/register.jsp</title>
</head>
<body>
	<form method="post" action="/board/register">
		<label>작성자</label>
		<input name="writer"/>
		<label>제목</label>
		<input name="title"/>
		<label>내용</label>
		<textarea name="content" placeholder="내용입력"></textarea>
		<button type="submit">등록</button>
	</form>

</body>
</html>