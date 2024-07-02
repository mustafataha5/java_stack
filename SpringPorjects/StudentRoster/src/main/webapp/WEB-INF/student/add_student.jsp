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
<title>Add New Student</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
<!-- change to match your file/naming structure -->

</head>
<body>
	<header class="m-5 text-center">
		<h1>New Student</h1>
	</header>
	<div class="row d-flex justify-content-center">
		<div class="col-md-6">
			<div class="card border-primary">
				<div class="card-body">
					<p>
						<a href="/">DashBoard</a>
					</p>
					<form:form>
					<table class="table">
						<tbody>
							<tr> <td> <label>Name:</label> </td>
								 <td> <input> </td>
							 </tr>
							 <tr> <td> <label>Dorm:</label> </td>
								 <td> <select>
								 	<option value="1">1</option>
								 </select> </td>
							 </tr>
							 <tr> <td colspan="2" ><button class="btn btn-primary w-100" type="submit"> Add </button></td> </tr>
							
						</tbody>
					</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>