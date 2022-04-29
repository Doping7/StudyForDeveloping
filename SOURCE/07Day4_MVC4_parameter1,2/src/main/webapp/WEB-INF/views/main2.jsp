<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String username = (String)request.getAttribute("username");
Integer age = (Integer)request.getAttribute("age");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main2.jsp
<%=username%>
<%= age %>
${username}
${age}
<%= session.getAttribute("username") %>
${login.name}
<img alt="aaa" src="resources/images/a.jpg" width="100", height="100">
</body>
</html>