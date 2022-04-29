<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id : ${sessionScope.login.userid}
passwd : ${sessionScope.login.passwd}
<hr>
<%
LoginDTO dto = (LoginDTO)session.getAttribute("login");
String userid = dto.getUserid();
String passwd = dto.getPasswd();
%>
<%=userid %>
<%=passwd %>
<%=dto %>
<hr>

<a href = "logout">로그아웃</a> 

</body>
</html>