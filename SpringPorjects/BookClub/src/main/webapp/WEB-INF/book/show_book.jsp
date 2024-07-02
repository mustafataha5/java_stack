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
<title>Show Book Details</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=" d-flex justify-content-between mx-5 mt-5 my-2">
		<h1 class="welcome">Add Book to Your Shelef!</h1>
		<div>
			<a href="/books" class="btn btn-outline-primary mx-3">Go Back</a> <a
				href="/logout" class="btn btn-outline-danger"> Logout</a>
		</div>
	</div>
	<hr class="line mx-5">

	<div class="mt-3  mx-5">
		<c:choose>
			<c:when test="${ book.user.id ==userId }">
				<h2>
					<span class="username">You</span> read <span class="booktitle">${book.title}</span>
					by <span class="bookaothur">${book.author}</span>
				</h2>
				<h3>Here are Your thought's.</h3>
			</c:when>
			<c:otherwise>
				<h2>
					<span class="username">${book.user.userName}</span> read <span
						class="booktitle">${book.title}</span> by <span class="bookaothur">${book.author}</span>
				</h2>
				<h3>Here are ${book.user.userName} thought's.</h3>
			</c:otherwise>
		</c:choose>

		<div class="row d-flex justify-content-center mt-4 mx-5">
			<div class="col-md-6">
				<div class="card p-5 border-dark">
					<div class="card-body">
						<p>${book.thoughts}</p>
					</div>
				</div>

				<c:if test="${book.user.id == userId }">
					<div class="card  my-3 border-light ">
						<div class="card-body d-flex justify-content-end">

							<a href="/books/${book.id}/edit"
								class=" mx-2 btn btn-outline-success">Edit</a>
							<form:form action="/books/${book.id}/delete" method="post"
								modelAttribute="editBook">
								<input type="hidden" name="_method" value="delete">
								<button type="submit" class="btn btn-outline-secondary">Delete</button>
							</form:form>

						</div>
					</div>
				</c:if>

			</div>
		</div>

	</div>

</body>
</html>