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
<title>Show Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/sytle.css">
<!-- change to match your file/naming structure -->
</head>
<body>

	<c:choose>
		<c:when test="${dojo == null}">
			<h1>Not Found Dojo</h1>
		</c:when>
		<c:otherwise>
			<div class="row m-5">
				<div class="col-md-6">
					<div class="card p-4">
						<h1 class="card-title">${dojo.name} Details:</h1>
						<div class="card-body">

							<table class="table table-sm">
								<thead class="table-dark">
									<th>First Name</th>
									<th>Last Name</th>
									<th>Age</th>
								</thead>
								<tbody>
									<c:forEach var="ninja" items="${dojo.ninjas}">

										<tr>
											<td>${ninja.firstName}</td>
											<td>${ninja.lastName}</td>
											<td>${ninja.age}</td>
										</tr>
									</c:forEach>
								</tbody>

							</table>
						</div>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>

</body>
</html>