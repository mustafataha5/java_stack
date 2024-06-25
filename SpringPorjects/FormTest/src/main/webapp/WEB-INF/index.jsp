<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" 	type="text/css"	href="/css/style.css" >
</head>
<body>

	<h1>Login</h1>
	<p class="error"><c:out value="${error}"/></p>
	<form action="/login" method="post">
		<label>Email : </label> <input type="email" name="email"> 
		<label>Password: </label> <input type="password" name="password">
		<button type="submit">Login</button>
	</form>

</body>
</html>