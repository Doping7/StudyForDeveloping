<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
post 방식<br>
아이디 : <input type = "text" name = "userid">
비밀번호 : <input type="text" name="passwd"> 
<input type="submit" value = "로그인">
</form>
<hr>
<form action="login" method="get">
get 방식<br>
아이디 : <input type = "text" name = "userid">
비밀번호 : <input type="text" name="passwd"> 
<input type="submit" value = "로그인">
</form>
</body>
</html>