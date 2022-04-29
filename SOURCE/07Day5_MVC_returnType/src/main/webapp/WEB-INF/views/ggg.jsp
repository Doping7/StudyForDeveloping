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
ggg.jsp<br>
<%
String userid = (String)request.getAttribute("username");

%>
${username}
<%=userid%>

</body>
</html>