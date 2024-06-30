<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Burger</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="/css/style1.css">
</head>
<body>
	<header>
		<h1>Edit Burger:</h1>
		<div><a href="/"> Go Back </a></div>
	</header>
	
	<div class="EditBook">
		<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
			 <input type="hidden" name="_method" value="put">
			<p class="errors">
				<form:errors path="burgerName"></form:errors>
			</p>
			
			<p class="errors">
				<form:errors path="restaurantName"></form:errors>
			</p>
			
			<p class="errors">
				<form:errors path="rating"></form:errors>
			</p>
			<p class="errors">
				<form:errors path="note"></form:errors>
			</p>


				<h4>
				<form:label path="burgerName">Burger Name:</form:label>
				<form:input path="burgerName" />
				</h4>
				
			<h4>
				<form:label path="restaurantName">Restaurant Name:</form:label>
				<form:input path="restaurantName" />
			</h4>
			<h4>
				<form:label path="rating">rating:</form:label>
				<form:input path="rating" />
			</h4>
			<h4>
				<form:label path="note">note:</form:label>
				<form:textarea path="note" />
			</h4>
				<button type="submit" class="mybtn">Add Burer</button>
			
		</form:form>
	</div>
</body>
</html>