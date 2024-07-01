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
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="row m-5">
		<div class="col-md-6 ">
			<div class="card p-4">
				<h1 class="card-title">Add Dojo:</h1>
				<div class="card-body">
					<form:form action="/dojos/new" method="post"  modelAttribute="dojo">
						<p class="errors"> <form:errors path="name"></form:errors> </p>
						
						<table class="table">
							<tr>
								<td> <form:label path="name"> Name: </form:label> </td>
								<td> <form:input path="name"/> </td>
							</tr>
							<tr>
								<td>  </td>
								<td> <button class="btn btn-outline-primary" type="submit">Add Dojo</button> </td>
							</tr>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>