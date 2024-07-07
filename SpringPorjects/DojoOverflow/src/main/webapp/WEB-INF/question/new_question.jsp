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
<title>New Question</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>

	<div class="row d-flex justify-content-center my-5 mx-3">
		<div class="col-md-8">
			<div class="card p-4 border-light">
				<h1 class="card-title mx-3">What is your Question ?</h1>
				<p class="mx-4">
					<a href="/">Dashboard</a>
				</p>
				<div class="card-body">
					<form:form action="/questions/new" method="post"
						modelAttribute="newQuestion">
						<form:errors class="error" path="text"></form:errors>
						<p class="error" >${tags_error}</p>
						<table class="table">
							<tbody>
								<tr>
									<td> <form:label path="text">Question</form:label> </td>
									<td style='height:10rem;'><form:textarea class="w-100 h-100"   path="text"/> </td>
								</tr>
								<tr>
									<td> <label >Tag</label> </td>
									<td> <input class="w-100" type="text" name="tags"/> </td>
								</tr>
								<tr>
									<td> </td>
									<td> <button type="submit"class="btn btn-outline-primary" > Create Question</button> </td>
									
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