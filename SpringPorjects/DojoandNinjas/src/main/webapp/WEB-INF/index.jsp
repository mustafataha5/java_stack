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
<title>Main Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/sytle.css">
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="row m-5">
		<div class="col-md-6">
			<div class="card p-4">
				<h1 class="card-title">Main Page</h1>
				<div class="card-body">
					<div class="my-4">
						<a href="/dojos/new" class="btn btn-outline-dark"> New Dojo</a>
					 <a href="/ninjas/new" class="btn btn-outline-dark"> New Ninja</a>
					</div>
					
					<table class="table w-50">
						<thead class="table-dark">
							<th>Dojo Name</th>
						</thead>
						<tbody>
							<c:forEach var="oneDojo" items="${dojos}">
								
							<tr>  <td> <a href="/dojos/${oneDojo.id}">${oneDojo.name}</a> </td> </tr>
							</c:forEach>
						</tbody>
						
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>