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
<title>Login and Registration</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=" d-flex justify-content-between mx-5 mt-5 my-2">
		<h1 class="welcome">Welcome ${user.userName}!!!</h1>
		<div>
			<a href="/logout" class="btn btn-outline-danger"> Logout</a>
		</div>
	</div>

	<div class=" d-flex justify-content-between my-1 mx-5">
		<h4 class="welcome">Books from everyone's shelves:</h4>
		<div>
			<a href="/books/new" class="btn btn-outline-warning"> + book to
				shelef</a>
		</div>
	</div>
	<p class="success">${success}</p>
	<div class="row d-flex justify-content-center mx-5 mt-3">
		<div class="col-md">
			<div class="card border-light">
				<div class="card-body">
					<table class="table  text-center">
						<thead class="table-primary">
							<th>ID</th>
							<th>Title</th>
							<th>Author Name</th>
							<th>Owner</th>
							<th>Action</th>
						</thead>
						<tbody>
							<c:forEach var="book" items="${books}">
								<tr>
									<td>${book.id}</td>
									<td><a href="/books/${book.id}"> ${book.title} </a></td>
									<td>${book.author}</td>
									<td>${book.user.userName}</td>
									<td><c:choose>
											<c:when test="${book.user.id == userId}">
												<div class="d-flex justify-content-center">
													<a href="/books/${book.id}/edit"
														class=" mx-2 btn btn-outline-success">Edit</a>

													<form action="/books/${book.id}/delete" method="post">
														<input type="hidden" name="_method" value="delete">
														<button type="submit" class="btn btn-outline-secondary">Delete</button>
													</form>
												</div>
											</c:when>
											<c:otherwise>
												<form:form action="/books/${book.id}/borrow" method="post"
													modelAttribute="browoBook">
													<button type="submit" class="btn btn-outline-secondary">Borrow</button>
												</form:form>

											</c:otherwise>
										</c:choose></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	<div class="row d-flex justify-content-center mx-5 mt-3">
		<div class="col-md">
			<div class="card border-light">
				<h4 class="card-title welcome">Books borrowed by me:</h4>
				<div class="card-body">
					<table class="table  text-center">
						<thead class="table-primary">
							<th>ID</th>
							<th>Title</th>
							<th>Author Name</th>
							<th>Owner</th>
							<th>Action</th>
						</thead>
						<tbody>
							<c:forEach var="book" items="${borrowBooks}">
								<tr>
									<td>${book.id}</td>
									<td><a href="/books/${book.id}"> ${book.title} </a></td>
									<td>${book.author}</td>
									<td>${book.user.userName}</td>
									<td>
										<form action="/books/${book.id}/borrow" method="post">
											<input type="hidden" name="_method" value="delete">
											<button type="submit" class="btn btn-outline-secondary">Return</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>



</body>
</html>