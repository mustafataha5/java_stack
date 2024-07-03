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
<title>Home</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>

	<header class="m-3">
		<h1 class="mycolor w-25 mx-auto ">Home Page</h1>
	</header>
	
	<p class=" mx-5 success">${success}</p>
	<div class="mx-5 mt-5">
		<h4>  <a href="categories/new"> add new category</a> </h4>
		<h4>  <a href="products/new"> add new products</a> </h4>
	</div>
	<hr class="mx-5 mt-5 border-dark">
	<div class="row d-flex justify-content-center">
		<div class="col-md-8">
			<div class="card border-light">
				<div class="card-body">
					<table class="table table-md text-center border-dark table-bordered">
						<thead class="table-secondary border-dark">
							<th>Products</th>
							<th>Categories</th>
						</thead>
						<tbody>
							<tr>
								<td class="border-dark">
								<c:forEach var="oneProduct" items="${products}">
									 <p><a href="/products/${oneProduct.id}">${oneProduct.name}</a> </p>
								</c:forEach>
								</td>
								<td class="border-dark">
								<c:forEach var="oneCategory" items="${categories}">
									 <p><a href="/categories/${oneCategory.id}">${oneCategory.name}</a> </p>
								</c:forEach>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	


</body>
</html>