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
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/sytle.css">
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="row m-5">
		<div class="col-md-6 ">
			<div class="card p-4">
				<h1 class="card-title">Add Ninja:</h1>
				<div class="card-body">
					<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
						<p class="errors">
							<form:errors path="firstName"></form:errors>
						</p>
						<p class="errors">
							<form:errors path="lastName"></form:errors>
						</p>
						<p class="errors">
							<form:errors path="age"></form:errors>
						</p>
						<table class="table">
						
						<tr>
								<td><form:label path="dojo"> Dojo: </form:label></td>
								<td> <form:select path="dojo">
										<c:forEach var="oneDojo" items="${dojos}">
											<form:option value="${oneDojo.id}">${oneDojo.name} </form:option>
										</c:forEach>
								</form:select> </td>
							</tr>
							<tr>
								<td><form:label path="firstName"> First Name: </form:label></td>
								<td><form:input path="firstName" /></td>
							</tr>
							<tr>
								<td><form:label path="lastName"> Last Name: </form:label></td>
								<td><form:input path="lastName" /></td>
							</tr>
							<tr>
								<td><form:label path="age"> Age: </form:label></td>
								<td><form:input path="age" /></td>
							</tr>
							<tr>
								<td></td>
								<td>
									<button class="btn btn-outline-primary" type="submit">Add
										Dojo</button>
								</td>
							</tr>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>