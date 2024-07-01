<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<div class="mx-5 d-flex justify-content-center">
		<div
			class=" w-75 mt-5 mx-5 d-flex justify-content-between align-items-center ">
			<h1 class="card-title mx-5 mt-3 mycolor">Expense Details:</h1>
			<div class=" mx-5 mt-3">
				<a href="/expense">Go Back</a>
			</div>
		</div>
	</div>

	<div class="row mx-4 mt-1 d-flex justify-content-center ">
		<div class="col-md-8 mx-5 p-4">
			<div class="card border-primary">

				<div class="card-body">
					
						<table class="table w-75 mx-5 ">
							<tr>
								<td> <h4>Expense Name:</h4> 
								</td>
								<td> ${expense.expenseName}</td>
							</tr>
							
							<tr>
								<td> <h4>Expense Description:</h4> 
								</td>
								<td> ${expense.description}</td>
							</tr>
							
							<tr>
								<td> <h4>Expense Vender:</h4> 
								</td>
								<td> ${expense.vender}</td>
							</tr>
							
							<tr>
								<td> <h4>Amount Spent:</h4> 
								</td>
								<td> $${expense.amount}</td>
							</tr>
							
						</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>