<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUTroutes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> Query and Join </title>
    
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
     
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>

<div id ="home" class="row d-flex justify-content-center m-5">
	<div class="col-8">
		<div id="query_1" class="card text-center">
			<div class="card-body">
				<p> <a href="#query_1">Query_1</a>  | <a href="#query_2">Query_2</a>
				| <a href="#query_3">Query_3</a>
				| <a href="#query_4">Query_4</a>
				| <a href="#query_5">Query_5</a>
				| <a href="#query_6">Query_6</a>
				| <a href="#query_7">Query_7</a>
				| <a href="#query_8">Query_8</a>  </p>
			</div>
		</div>
	</div>
</div>



<div id="query_1" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 1</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Conrty</th>
						<th>Language</th>
						<th>Percentage</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_1}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>



<div id="query_2" class="row d-flex justify-content-center">
	<div class="col-8">
		<div class="card border-light">
			<h2 class="card-title">Query 2</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Conrty</th>
						<th>Number of Cities</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_2}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

	
<div id="query_3" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 3</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>City</th>
						<th>Population</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_3}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>



<div id="query_4" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 4</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Country</th>
						<th>Language</th>
						<th>Percentage</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_4}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<div id="query_5" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 5</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Country</th>
						<th>Surface Area</th>
						<th>Population</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_5}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<div id="query_6" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 6</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Country</th>
						<th>Surface Area</th>
						<th>Life Expectancy</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_5}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>


<div id="query_7" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 7</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Country</th>
						<th>City</th>
						<th>District</th>
						<th>Population</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_7}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
								<td>${row[3]}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<div id="query_8" class="row d-flex justify-content-center">
	<div class="col-8">
		<div  class="card border-light">
			<h2 class="card-title">Query 8</h2>
			<p> <a href="#home"> Go back</a></p>
			<div class="card-body">
				<table class="table table-bordered text-center">
					<thead class="table-primary">
						<th>Region</th>
						<th>Number of Countries</th>
					</thead>
					<tbody>
						<c:forEach var="row" items="${query_8}" >
							<tr>
								<td>${row[0]}</td>
								<td>${row[1]}</td>
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