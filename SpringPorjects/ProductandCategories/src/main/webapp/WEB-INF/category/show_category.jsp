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
<title>Category Page</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>

	<header class="m-3">
		<h1 class="mycolor w-25 mx-auto ">${category.name}</h1>
	</header>
	<div class="mx-5 mt-5">
		<h4>
			<a href="/"> Home</a>
		</h4>
	</div>
	<hr class="mx-5 mt-3 border-dark">
	<div class="mx-5 mt-3">
		<h1>Product:</h1>
		<ul class="list mx-5">
			<c:forEach var="oneProduct" items="${category.products}">
					<li  > <p class="mx-3"> ${oneProduct.name}</p> </li>
			</c:forEach>
		</ul>
	</div>
	<hr class="mx-5 mt-2 border-dark">
	<div class="mx-5 mt-3">
		<h1>Add Product:</h1>
		<p class="mx-5 error">${NotSelect}</p>
		<div>
			<form action="/categories/${category.id}" method="post" >
					<div class="mx-5 mt-4">
						<select class="fs-1" name="addProduct">
						<option class="fs-1" value="0">Select Product</option>
						<c:forEach var="ex_product1" items="${ex_products}">
						 <option class="fs-1" value="${ex_product1.id}">${ex_product1.name}</option>
						</c:forEach>
					    </select>
					</div>
					<button type="submit" class="btn btn-outline-dark mt-4 mx-5"> Add </button>
			</form>
		</div>
			
	</div>

</body>
</html>