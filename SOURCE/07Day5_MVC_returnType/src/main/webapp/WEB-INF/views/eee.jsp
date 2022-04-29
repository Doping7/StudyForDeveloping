<%@page import="java.util.ArrayList"%>
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
eee.jsp<br>
<%
ArrayList<String> list = (ArrayList<String>)request.getAttribute("yyy");

%>

<%=list%>

</body>
</html>