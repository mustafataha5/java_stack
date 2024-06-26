<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Share</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>
	

	<div class="row my-5  d-felx justify-content-center">
		<div class="col-md-8">
			<div class="card p-5">
			<h1 class="card-title">All Books :</h1>
				<div class="card-body ">
					<table class="table border-dark">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Title</th>
								<th scope="col">Description</th>
								<th scope="col">NumOfPage</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="book" items="${books}">
								<tr>
									<td><c:out value=" ${book.id}"></c:out></td>
									<td><a href="/books/${book.id}">${book.title }</a> </td>
									<td>${book.description }</td>
									<td>${book.numberOfPages }</td>
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