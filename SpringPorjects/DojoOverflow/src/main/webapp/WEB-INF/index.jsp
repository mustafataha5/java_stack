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
<title>Dojo OverFlow</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
</head>
<body>

	<div class="row d-flex justify-content-center my-5 mx-3">
		<div class="col-8">
			<div class="card p-4 border-light">
				<h1 class="card-title mx-3">Question DashBoard</h1>
				<div class="card-body">
					<table class="table">
						<thead class="table-secondary">
							<tr>
								<td>Question</td>
								<td>Tag</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<c:forEach var="question" items="${questions}">
									<td>${question.text}</td>
									<td>
									>>>
										<c:forEach var="tag" items="${question.tags}">
										 <span>${tag} >>>>,</span>					
										</c:forEach>
									</td>
								</c:forEach>

							</tr>
						</tbody>
					</table>
					<div class=" d-flex justify-content-end">
						<div>
							<a href="/questions/new">+ new question</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>