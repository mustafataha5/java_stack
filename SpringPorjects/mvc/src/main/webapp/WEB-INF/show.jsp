<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book INFO show</title>
</head>
<body>

	<c:choose>
		<c:when test="${book != null}">
			<h1>${book.title }</h1>
			<h3>Description : ${book.description}</h3>
			<h3>Language : ${book.language}</h3>
			<h3>Number Of Pages: ${book.numberOfPages}</h3>

		</c:when>
		<c:otherwise>
			<h1>Not Founded Book</h1>
		</c:otherwise>
	</c:choose>


</body>
</html>