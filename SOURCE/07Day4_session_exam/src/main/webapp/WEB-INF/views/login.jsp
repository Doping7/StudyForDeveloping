<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
LoginDTO dto = (LoginDTO)session.getAttribute("login");
String userid = dto.getUserid();
String passwd = dto.getPasswd();
%>
id : <%=userid %>
pw : <%=passwd %>
<a href = "logout">๋ก๊ทธ์์</a>
</body>
</html>