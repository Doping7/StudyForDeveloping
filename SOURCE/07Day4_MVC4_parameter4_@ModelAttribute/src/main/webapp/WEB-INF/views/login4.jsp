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

id : ${login.name}<br>
passwd : ${login.passwd}<br>
<%
LoginDTO dto = (LoginDTO)request.getAttribute("loginDTO");
String name = dto.getName();
out.print(name+"<br>");
%>

</body>
</html>