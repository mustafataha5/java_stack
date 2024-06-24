<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit counter</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

	<div class="container">
		<c:choose>
			<c:when test="${counter == null }">
				<h2>
					You have visit your <a href="/">http://yourserver</a> 0 times
					(still not visit main page)
				</h2>
			</c:when>
			<c:otherwise>
				<h2>
					You have visit your <a href="/">http://yourserver</a>
					<c:out value="${counter}"></c:out>
					times
				</h2>

			</c:otherwise>
		</c:choose>

		<h2>
			<a href="/"> Test another visit!</a>
		</h2>
	</div>


</body>
</html>