<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show book</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<header class="main_header">
		<h1>Show Book Details:</h1>
		<div>
			<a href="/books">Go Back</a>
		</div>
	</header>
	<hr>
	<div class="showBook">
		<div>
			<c:choose>
				<c:when test="${book==null}">
					<h1>Not Found Book</h1>
				</c:when>
				<c:otherwise>
					<h2>Title : ${book.title}</h2>
					<h2>Title : ${book.description}</h2>
					<h2>Title : ${book.language}</h2>

				</c:otherwise>
			</c:choose>
		</div>

	</div>


</body>
</html>