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
<%
LoginDTO dto = (LoginDTO)request.getAttribute("login");
String name = dto.getName();
String passwd = dto.getPasswd();
out.print(name);
out.print(passwd);
%>

${login.name}
${login.passwd}
</body>
</html>