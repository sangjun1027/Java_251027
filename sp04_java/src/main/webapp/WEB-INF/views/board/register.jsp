<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/register.jsp</title>
</head>
<body>
	<h3>게시글 ${ empty board.bno ? "등록" : "수정" }</h3>
	
	<form method="post">
		<input type="hidden" name="bno" value="${board.bno}"/>
		
		<label>제목</label>
		<input name="title" value="${board.title}" /><br>
		
		<label>작성자</label>
		<input name="writer" value="${board.writer}" /><br>
		
		<label>내용</label><br>
		<textarea name="content" placeholder="내용입력">${board.content}</textarea><br>
		
		
		<c:if test="${empty board.bno}">
			<button type="submit" formaction="/board/register">등록</button>
		</c:if>
		
		<c:if test="${not empty board.bno}">
			<button type="submit" formaction="/board/modify">수정</button>
		</c:if>
	</form>
</body>
</html>

