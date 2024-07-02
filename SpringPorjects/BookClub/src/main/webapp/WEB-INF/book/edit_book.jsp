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
<title>Edit Book</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=" d-flex justify-content-between mx-5 mt-5 my-2">
		<h1 class="welcome">Edit your Entry!</h1>
		<div>
			<a href="/books" class="btn btn-outline-primary mx-3">Go Back</a> <a
				href="/logout" class="btn btn-outline-danger"> Logout</a>
		</div>
	</div>
	<hr class="line mx-5">
	<div class="row d-flex justify-content-center mx-5 mt-3">
		<div class="col-md-8">
			<div class="card w-100 border-light">
				<div class="card-body ">
					<form:form action="/books/${editBook.id}/edit" method="post"
						modelAttribute="editBook">
						<input type="hidden" name="_method" value="put">
						<p class="error">
							<form:errors path="title"></form:errors>
						</p>
						<p class="error">
							<form:errors path="author"></form:errors>
						</p>
						<p class="error">
							<form:errors path="thoughts"></form:errors>
						</p>
						<table class="table">
							<tbody>
								<form:hidden path="user" value="${user.id}" />
								<tr>
									<td><form:label path="title">Title:</form:label></td>
									<td><form:input path="title" class="w-100" /></td>
									
								</tr>
								<tr>
									<td><form:label path="author">Author:</form:label></td>
									<td><form:input path="author" class="w-100" /></td>
									
								</tr>
								<tr>
									<td><form:label path="thoughts">Thoughts:</form:label></td>
									<td ><form:textarea path="thoughts"  class="w-100 h-50"/></td>
									
								</tr>
								<tr>
									<td></td>
									<td>
										<button type="submit" class="btn btn-outline-success">Edit Book</button>
									</td>
								</tr>
							</tbody>
						</table>
					</form:form>

				</div>
			</div>
		</div>
	</div>


</body>
</html>