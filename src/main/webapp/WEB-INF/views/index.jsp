<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	<h1>DONUTS DONUTS DONUTS</h1>
	
	<!-- <table class="table">
		<tr>
			<th>Donut Flavors</th>
		<tr> -->
		
		<ul>
			<c:forEach items="${list}" var="donut">
			<li><a href="/details?id=${donut.id}">${donut.name}</a></li>
			
			
				<%-- <tr>
					<td>${donut.name}</td>
				</tr> --%>
				
			</c:forEach>
		</ul>
<!-- 	</table>
 -->	<br>
	<br>
	</div>
</body>
</html>