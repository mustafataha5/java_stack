<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login and Registation</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>

	<div class="m-5 px-4">
		<h1 class="welcome ">Welcome!</h1>
		<h4 class="">Join our growing community</h4>
	</div>


	<div class="row mx-5">
		<div class="col-md">
			<div class="card p-3 border-dark h-100">
				<h2 class="card-title">Registeration</h2>
				<div class="card-body">
					<form:form action="/register" method="post"
						modelAttribute="newUser">
						<p class="errors">
							<form:errors path="userName"></form:errors>
						</p>
						<p class="errors">
							<form:errors path="email"></form:errors>
						</p>
						<p class="errors">
							<form:errors path="password"></form:errors>
						</p>
						<table class="table-sm table">
							<tr>
								<td><form:label path="userName">Username:</form:label></td>
								<td><form:input path="userName" /></td>
							<tr>
							<tr>
								<td><form:label path="email">Email:</form:label></td>
								<td><form:input path="email" /></td>
							<tr>
							<tr>
								<td><form:label path="password">Password:</form:label></td>
								<td><form:input path="password" /></td>
							<tr>
							<tr>
								<td><form:label path="">Confirm PW:</form:label></td>
								<td><form:input path="" /></td>
							<tr>
							<tr>
								<td></td>
								<td>
									<button type="submit" class="btn btn-primary">Registeration</button>
								</td>
							<tr>
						</table>
					</form:form>
				</div>
			</div>
		</div>

		<div class="col-md">
			<div class="card p-4 border-dark h-100">
				<h2 class="card-title">Login</h2>
				<div class="card-body">
					<form:form action="/login" method="post"
						modelAttribute="newLogin">
						<p class="errors">
							<form:errors path="email"></form:errors>
						</p>
						<p class="errors">
							<form:errors path="password"></form:errors>
						</p>
						<table class="table-sm table">
							<tr>
								<td><form:label path="email">Email:</form:label></td>
								<td><form:input path="email" /></td>
							<tr>
							<tr>
								<td><form:label path="password">Password:</form:label></td>
								<td><form:input type="password" path="password" /></td>
							<tr>
							<tr>
								<td></td>
								<td>
									<button type="submit" class="btn btn-primary">Login</button>
								</td>
							<tr>
						</table>
					</form:form>
				</div>
			</div>
		</div>

	</div>


</body>
</html>