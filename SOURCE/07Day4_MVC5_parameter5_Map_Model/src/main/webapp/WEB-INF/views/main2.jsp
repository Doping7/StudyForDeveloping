<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${username}
${address}

<%
String name = (String)request.getAttribute("username");
String address = (String)request.getAttribute("address");
%>

<%= name %>
<%= address %>
</body>
</html>