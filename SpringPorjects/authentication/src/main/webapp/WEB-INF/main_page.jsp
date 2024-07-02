<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
     
    <link rel="stylesheet" href="/css/style.css"> 
</head>
<body>

	<div class="m-5 px-4 d-flex justify-content-between ">
		<h1 class="welcome ">Welcome! ${ user.userName}</h1>
		<div>
			<form action="/user/${user.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
				<button class="btn btn-outline-danger" type="submit">Logout</button>
			</form>
		</div>
	</div>
	

</body>
</html>