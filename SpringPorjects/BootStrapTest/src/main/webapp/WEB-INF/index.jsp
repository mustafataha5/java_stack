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
<title>Tacos</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

  <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
   
</head>
<body>

	<button class="btn btn-outline-dark btn-sm">Add</button>
	<button class=" btn btn-primary btn-lg  mybtn ">Add</button>

	<div></div>
	<table
		class="table table-primary text-center table-bordered border-dark mx-5">
		<thead class="">
			<th>Id</th>
			<th>FirstName</th>
			<th>LasttName</th>
		</thead>
		<tbody class="">
			<tr>
				<td>1</td>
				<td>mustafa</td>
				<td>taha</td>
			</tr>
			<tr>
				<td>1</td>
				<td>mustafa</td>
				<td>taha</td>
			</tr>
			<tr>
				<td>1</td>
				<td>mustafa</td>
				<td>taha</td>
			</tr>
			<tr>
				<td>1</td>
				<td>mustafa</td>
				<td>taha</td>
			</tr>
		</tbody>

	</table>


	<div class="row m-5 d-flex justify-content-between">
		<div class="col-3">
			<table
				class="table table-primary text-center table-bordered border-dark mx-5">
				<thead class="">
					<th>Id</th>
					<th>FirstName</th>
					<th>LasttName</th>
				</thead>
				<tbody class="">
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
				</tbody>

			</table>
		</div>
		<div class="col-3">
			<table
				class="table table-primary text-center table-bordered border-dark mx-5">
				<thead class="">
					<th>Id</th>
					<th>FirstName</th>
					<th>LasttName</th>
				</thead>
				<tbody class="">
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
					<tr>
						<td>1</td>
						<td>mustafa</td>
						<td>taha</td>
					</tr>
				</tbody>

			</table>
		</div>

	</div>


	<div class="row m-5 ">
		<div class="col-4">
			<div class="card border-danger p-3">
				<h1>My Table 1</h1>
				<div class="card-body">
					<table
						class="table table-primary text-center table-bordered border-dark">
						<thead class="">
							<th>Id</th>
							<th>FirstName</th>
							<th>LasttName</th>
						</thead>
						<tbody class="">
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
						</tbody>

					</table>

				</div>
			</div>



		</div>
		<div class="col-4">
			<div class="card border-danger p-3 h-50">
				<h1>My Table 1</h1>
				<div class="card-body">
					<table
						class="table table-primary text-center table-bordered border-dark">
						<thead class="">
							<th>Id</th>
							<th>FirstName</th>
							<th>LasttName</th>
						</thead>
						<tbody class="">
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
							<tr>
								<td>1</td>
								<td>mustafa</td>
								<td>taha</td>
							</tr>
							
						</tbody>

					</table>

				</div>
			</div>

	</div>


</body>
</html>