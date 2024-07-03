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
<title>New Category</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>

	<header class="m-3">
		<h1 class="mycolor w-25 mx-auto ">New Product</h1>
	</header>
	<div class="mx-5 mt-5">
		<h4>
			<a href="/"> Home</a>
		</h4>
	</div>
	<hr class="mx-5 mt-5 border-dark">
	<div class="row d-flex justify-content-center">
		<div class="col-md-8">
			<div class="card border-light">
				<div class="card-body">
					<form:form action="/products/new" method="post"
						modelAttribute="newProduct">
						<p class="error"><form:errors path="name"></form:errors></p>
						<p class="error"><form:errors path="description"></form:errors></p>
						<p class="error"><form:errors path="price"></form:errors></p>

						<table class="table table-md text-center">
							<tbody>
								<tr>
									<td><form:label path="name">Product Name:</form:label></td>
									<td><form:input path="name" /></td>
								</tr>
								<tr>
									<td><form:label path="description">Product Description:</form:label></td>
									<td><form:input path="description" /></td>
								</tr>
								<tr>
									<td><form:label path="price">Product Price:</form:label></td>
									<td><form:input path="price"/></td>
								</tr>
								<tr>
									<td></td>
									<td>
										<button type="submit" class="btn btn-outline-dark w-75">Create
											Product</button>
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