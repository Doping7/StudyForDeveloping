<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main.jsp</h1>
<%
/* String userid = (String)request.getParameter("userid"); */
String userid = (String)request.getAttribute("userid");
%>
1. <%=userid %><br>
2. ${userid}<br>
3.<%=request.getParameter("userid")%>
</body>
</html>