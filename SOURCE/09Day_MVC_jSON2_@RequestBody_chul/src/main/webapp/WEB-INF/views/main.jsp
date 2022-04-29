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
$("#aaa").on("click", function(){
	$.ajax({
		url:"aaa",
		type:"post",
		dataType:"text",
		headers: {
			"Content-Type" : "application/json"
		},
		data : JSON.stringify({userid:"홍길동",passwd:"1234"}),
		success: function(data, status, xhr) {
			console.log(data);
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#bbb").on("click", function(){
	$.ajax({
		url:"bbb",
		type:"post",
		dataType:"text",
		headers: {
			"Content-Type" : "application/json"
		},
		data : JSON.stringify(
				[
				{userid:"홍길동",passwd:"1234"},
				{userid:"이순신",passwd:"5678"}
				]		
		),
		success: function(data, status, xhr) {
			console.log(data);
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#ccc").on("click", function(){
	$.ajax({
		url:"ccc",
		type:"get",
		dataType:"text",		
		data : {userid:"홍길동",passwd:"1234"},
		success: function(data, status, xhr) {
			console.log(data);
		},
		error: function(xhr, status, error){
			console.log(error);
		}
	});
});
$("#ddd").on("click", function(){
	$.ajax({
		url:"ddd",
		type:"get",
		dataType:"text",		
		data : {userid:"홍길동"},
		success: function(data, status, xhr) {
			console.log(data);
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
<button id = "aaa">aaa호출</button><br>
<button id = "bbb">bbb호출</button><br>
<button id = "ccc">ccc호출</button><br>
<button id = "ddd">ddd호출</button><br>

</body>
</html>