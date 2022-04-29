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
ccc.jsp<br>
<%
LoginDTO dto = (LoginDTO)request.getAttribute("loginDTO");
String userid = dto.getUserid();
String passwd = dto.getPasswd();
%>

<%=userid%>
<%=passwd %>
</body>
</html>