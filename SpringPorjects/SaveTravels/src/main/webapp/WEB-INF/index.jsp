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
<title>Save Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">

</head>
<body>

	<div class="row mx-4 mt-3 d-flex justify-content-center ">
		<div class="col-md-8 mx-5 p-4">
			<div class="card border-primary">
				<h1 class="card-title mx-4 mt-3 mycolor">Save Travels</h1>
				<div class="card-body">
					<table class="table ">
						<thead class="table-primary">
							<th>Expense</th>
							<th>Vender</th>
							<th>Amount</th>
						</thead>
						<tbody class="table-light">
							<c:forEach var="expense" items="${expenses}">
								<tr>
									<td>${expense.expenseName}</td>
									<td>${expense.vender}</td>
									<td>${expense.amount}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>
	<div class="row mx-4 mt-1 d-flex justify-content-center ">
		<div class="col-md-8 mx-5 p-4">
			<div class="card border-primary">
				<h3 class="card-title mx-4 mt-3 mycolor">Add New Expense </h3>
				<div class="card-body">
					<form:form action="/expense" method="post" modelAttribute="newExpense" >
						<p class="errors"> <form:errors path="expenseName"></form:errors> </p>
						<p class="errors"> <form:errors path="vender"></form:errors> </p>
						<p class="errors"> <form:errors path="amount"></form:errors> </p>
						<p class="errors"> <form:errors path="description"></form:errors> </p>
						<table class="table ">
							<tr>
							  <td> <form:label path="expenseName">Expense Name:</form:label> </td>
							  <td> <form:input path="expenseName"/> </td>
							</tr>
							<tr>
							  <td> <form:label path="vender">Vender:</form:label> </td>
							  <td> <form:input path="vender"/> </td>
							</tr>
							<tr>
							  <td> <form:label path="amount">Amount:</form:label> </td>
							  <td> <form:input path="amount"/> </td>
							</tr>
							<tr>
							  <td> <form:label path="description">Description</form:label> </td>
							  <td> <form:textarea path="description"/>	</td>
							</tr>
							<tr>
							  <td>  </td>
							  <td class="w-50 d-flex justify-content-end"> <button class="btn mybtn btn-primary">Add Expense</button> </td>
							</tr>
							
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>