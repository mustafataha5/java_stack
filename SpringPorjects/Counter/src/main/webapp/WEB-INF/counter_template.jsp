<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit counter</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

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
		<h2>
			<a href="/Main2"> Test another visit !(add Counter by 2)</a>
		</h2>
		
		<h2>
			<a href="/reset"  class="btn btn-outline-danger"> Reset Counter</a>
		</h2>
	</div>
	


</body>
</html>