<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type = "text/javascript">
$(function(){
$("#get").on("click", function(){
	$.ajax({
		url:"board",
		type:"get",
		dataType:"text",
		success: function(data, status, xhr) {
			console.log(data, "success");
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#post").on("click", function(){
	$.ajax({
		url:"board",
		type:"post",
		dataType:"text",
		success: function(data, status, xhr) {
			console.log(data, "success");
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#put").on("click", function(){
	$.ajax({
		url:"board",
		type:"put",
		dataType:"text",
		success: function(data, status, xhr) {
			console.log(data, "success");
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#delete").on("click", function(){
	$.ajax({
		url:"board",
		type:"delete",
		dataType:"text",
		success: function(data, status, xhr) {
			console.log(data, "success");
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
});
</script>
</head>
<body>
main.jsp<br>
<button id="get">get</button><br>
<button id="post">post</button><br>
<button id="put">put</button><br>
<button id="delete">delete</button><br>
</body>
</html>