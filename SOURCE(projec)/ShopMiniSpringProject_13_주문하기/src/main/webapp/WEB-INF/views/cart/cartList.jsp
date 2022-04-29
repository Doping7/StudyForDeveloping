<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	function totalxxx() {
		var totalSum = 0;
		$(".sum").each(function(idx, data) {
			totalSum += Number.parseInt($(data).text());
		})
		$("#totalSum").text(totalSum);

	}
	$(function() {

		totalxxx();
		$("#allCheck").on("click", function() {
			var result = this.checked;
			$(".check").each(function(idx, data) {
				data.checked = result;
			})
		});

		$("#delAllCart").on("click", function() {
			$("form").attr("action", "loginCheck/delAllCart");
			$("form").submit();
		});
		// 이 위로 복습할때 꼭 보기
		$("#orderBtn").on("click", function() {
			$("form").attr("action", "loginCheck/orderConfirm");
			$("form").submit();
		});
		$(".orderBtn").on("click", function() {
			var num = $(this).attr("data-num");
			location.href = "loginCheck/orderConfirm?num=" + num;
		});

		$(".updateBtn").on("click", function() {
			var num = $(this).attr("data-num");
			var gPrice = $(this).attr("data-price");
			var gAmount = $("#cartAmount" + num).val();

			$.ajax({
				type : "get",
				url : "loginCheck/cartUpdate",
				dataType : "text",
				data : {
					num : num,
					gAmount : gAmount,
				},
				success : function(data, status, xhr) {
					$("#sum" + num).text(gPrice * gAmount);
					totalxxx();
				},
				error : function(xhr, status) {
					alert("수정에 실패했습니다.");
				}

			});
		});
		$(".delBtn").on("click", function() {
			var num = $(this).attr("data-num");
			var xxx = $(this);
			$.ajax({
				type : "get",
				url : "loginCheck/cartDelete",
				dataType : "text",
				data : {
					num : num,
				},
				success : function(data, status, xhr) {
					xxx.parents().filter("tr").remove();//dom 삭제, 버튼의 부모의 tr을 지운다. 이는 결국 테이블의 행자체를 지운다는 의미
				},
				error : function(xhr, status) {

				}

			});
		});

	});
</script>
<!-- <script>
/* 자바스크립트 프론트 처리 => 이후 jquery로 변경할 것임.  */
   var httpRequest;
   var myNum;
	function amountUpdate(num){
	myNum=num;
		  var gAmount = 
			   document.getElementById("cartAmount"+num).value;
		   console.log(num, gAmount);

		httpRequest = new XMLHttpRequest();
		httpRequest.onreadystatechange=responseFun;
		
		var xxx= "CartUpdateServlet?num="+num+"&gAmount="+gAmount;
		httpRequest.open("get",xxx,true);
		httpRequest.send(null); //get방식
	}
	function responseFun(){
		if(httpRequest.readyState==4 && 
				httpRequest.status==200){
			 alert("수정 성공");
console.log(document.getElementById("ggPrice"+myNum));

		 var price = 
			 document.getElementById("ggPrice"+myNum).innerText;
		 var amount= 
			 document.getElementById("cartAmount"+myNum).value;
		var sum= Number.parseInt(price)* Number.parseInt(amount);
	 document.getElementById("sum"+myNum).innerText= sum;
			 
		}//end if
	}//end responseFun

	function delCart(num){
		location.href="CartDelServlet?num="+num;
	}
	
	function allCheck(xxx){
	  // class="check" 추출
	  var z = document.querySelectorAll(".check");
	  console.log(z);
	  for (var i = 0; i < z.length; i++) {
		z[i].checked= xxx.checked;
	}
	  /* for(var x of, z){
		  x.checked=xxx.checked;
	  } */
	}//
	
	function delAllCart(f){
		f.action="CartDelAllServlet";
		f.submit();
	}
	function order(num){
		location.href="CartOrderConfirmServlet?num="+num;
	}
	function orderAllConfirm(f){
		f.action="CartOrderAllConfirmServlet";
		f.submit();
	}
</script> -->

<table width="90%" cellspacing="0" cellpadding="0" border="0">

	<tr>
		<td height="30">
	</tr>

	<tr>
		<td colspan="5" class="td_default">&nbsp;&nbsp;&nbsp; <font
			size="5"><b>- 장바구니-</b></font> &nbsp;
		</td>
	</tr>

	<tr>
		<td height="15">
	</tr>

	<tr>
		<td colspan="10">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>

	<tr>
		<td height="7">
	</tr>

	<tr>
		<td class="td_default" align="center"><input type="checkbox"
			onclick="allCheck(this)" name="allCheck" id="allCheck"> <strong>전체선택</strong></td>
		<td class="td_default" align="center"><strong>주문번호</strong></td>
		<td class="td_default" align="center" colspan="2"><strong>상품정보</strong></td>
		<td class="td_default" align="center"><strong>판매가</strong></td>
		<td class="td_default" align="center" colspan="2"><strong>수량</strong></td>
		<td class="td_default" align="center"><strong>합계</strong></td>
		<td></td>
	</tr>

	<tr>
		<td height="7">
	</tr>



	<tr>
		<td colspan="10">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>



	<form name="myForm">


		<!-- 반복시작 -->
		<c:forEach var="x" items="${cartlist}">

			<!-- 	<input type="text" name="num81" value="81" id="num81">
			<input type="text" name="gImage81" value="bottom1" id="gImage81">
		 <input type="text" name="gName81" value="제나 레이스 스커트" id="gName81">
		  <input type="text" name="gSize81" value="L" id="gSize81">
		   <input type="text" name="gColor81" value="navy" id="gColor81"> 
		   <input type="text" name="gPrice81" value="9800" id="gPrice81"> -->

			<tr>
				<td class="td_default" width="80">
					<!-- checkbox는 체크된 값만 서블릿으로 넘어간다. 
			따라서 value에 삭제할 num값을 설정한다. --> <input type="checkbox" name="check"
					id="check81" class="check" value="${x.num}">
				</td>
				<td class="td_default" width="80">${x.num}</td>
				<td class="td_default" width="80"><img
					src="images/items/${x.gImage}.gif" border="0" align="center"
					width="80" /></td>
				<td class="td_default" width="300" style='padding-left: 30px'>
					${x.gName} <br> <font size="2" color="#665b5f">[옵션 :
						사이즈(${x.gSize}) , 색상(${x.gColor})] </font>
				</td>
				<td class="td_default" align="center" width="110"><span
					id="gPrice${x.num}">${x.gPrice}</span></td>
				<td class="td_default" align="center" width="90"><input
					class="input_default" type="text" name="cartAmount"
					id="cartAmount${x.num}" style="text-align: right" maxlength="3"
					size="2" value="${x.gAmount}"></input></td>
				<td><input class="updateBtn" type="button" value="수정"
					data-num="${x.num}" data-price="${x.gPrice}" /></td>
				<td class="td_default" align="center" width="80"
					style='padding-left: 5px'><span id="sum${x.num}" class="sum">
						${x.gAmount*x.gPrice} </span></td>
				<td><input type="button" value="주문" class="orderBtn"
					data-num="${x.num}"></td>
				<td class="td_default" align="center" width="30"
					style='padding-left: 10px'><input class="delBtn"
					data-num="${x.num}" type="button" value="삭제"></td>
				<td height="10"></td>
			</tr>

			<!-- 반복끝 -->
			<span id="allsum"></span>

		</c:forEach>
	</form>

	<tr>
		<td colspan="10">총합 : <span id="totalSum"></span>
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td height="30">
	</tr>

	<tr>
		<td align="center" colspan="5">
			<button id="orderBtn">전체 주문하기</button>
			<button id="delAllCart">전체 삭제하기</button> <a class="a_black"
			href="index.jsp"> 계속 쇼핑하기 </a>&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
	</tr>
	<tr>
		<td height="20">
	</tr>

</table>
