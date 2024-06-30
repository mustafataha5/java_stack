<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Book</title>
<link rel="stylesheet" type="text/css" href="/css/style2.css">
</head>
<body>
	<header class="main_header">
		<h1>Add New Book:</h1>
		<div>
			<a href="/books">Go Back</a>
		</div>
	</header>
	<hr>
	<form:form action="/books/new" method="POST" modelAttribute="book">
		<div class="myform">
			<form:label path="title">Title: </form:label>
			<form:errors path="title" class="errors"></form:errors>
			<form:input type="text" path="title" />
			
			<br>
			<form:label path="description">Description:</form:label>
			<form:errors path="description" class="errors"></form:errors>
			<form:input type="text" path="description" />

			<br>
			
			<form:label path="language">Language:</form:label>
			<form:errors  path="language" class="errors"></form:errors>
			<form:input type="text" path="language" />

			<br>
			<form:label path="numberOfPages">Number of Pages:</form:label>
			<form:errors path="numberOfPages" class="errors"></form:errors>
			<form:input type="number" path="numberOfPages" />

			<br>
			<button type="submit" class="mybtn">Add</button>
		</div>

	</form:form>
</body>
</html>