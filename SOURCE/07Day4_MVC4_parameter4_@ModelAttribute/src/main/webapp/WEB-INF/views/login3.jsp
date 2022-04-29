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
login.jsp<br>
id : ${xxx.name}<br>
passwd : ${xxx.passwd}<br>
<%
LoginDTO dto = (LoginDTO)request.getAttribute("xxx");
String name = dto.getName();
out.print(dto+"<br>");
%>
<hr>
4번 : ${dto.names}
</body>
</html>