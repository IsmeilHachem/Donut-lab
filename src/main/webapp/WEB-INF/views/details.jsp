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
		<h1>About The Donut!</h1>

		<p>Name: ${ detail.name }</p>
		<p>Calories: ${ detail.calories }</p>
		<p>Extras:</p>

		<ul>
			<c:forEach items="${detail.extras}" var="extras">
				<li>${extras}</li>
			</c:forEach>

		</ul>

		<br> <br> <a href="/"><button type="button"
				class="btn btn-danger">Show Me Thy Donuts!</button></a>
	</div>
</body>
</html>