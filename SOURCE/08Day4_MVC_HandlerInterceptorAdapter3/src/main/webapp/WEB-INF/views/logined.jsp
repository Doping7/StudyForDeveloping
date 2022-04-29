<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login.jsp<br>

${userid}
${passwd}<br>
<%=request.getAttribute("userid") %>
<%=request.getAttribute("passwd") %><br>
<%=session.getAttribute("login") %>
</body>
</html>