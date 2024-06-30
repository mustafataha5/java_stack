<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Burger Tracker</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>


	<div class="showtable">

		<h1>Burger Tracker</h1>
		<table>
			<thead>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating</th>
			</thead>
			<tbody>
				<c:forEach var="myburger" items="${ burgers}">
					<tr>
						<td>${myburger.burgerName}</td>
						<td>${myburger.restaurantName}</td>
						<td>${myburger.rating}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="addBook">
		<h2>Add a Burger</h2>
		<form:form action="/burger" method="post" modelAttribute="burger">
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