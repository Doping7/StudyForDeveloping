<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%><!-- exception객체 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> ERROR </h1>
<%
out.print(exception);
%>
<br>
<a href = "../">메인화면으로</a>
</body>
</html>