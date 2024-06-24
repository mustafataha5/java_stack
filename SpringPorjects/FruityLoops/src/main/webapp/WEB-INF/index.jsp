<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fn"   uri = "http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loop</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/script.js"></script>
</head>
<body>


	<div class="row d-flex justify-content-center  mt-5">
		<div class="col-sm-6">
			<h1 class="card-title mytitle">Fruit Store</h1>
			<div class="card  myshadow">
				<div class="card-body ">

					<table class="table border-info  text-center">
						<thead>
							<tr>
								<th>Name</th>
								<th>Price</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="fruit" items="${data}">
								<c:choose>
							 	
									<c:when test="${fruit.name.startsWith('G')}">
										<tr class="green">
											<td><c:out value="${fruit.name} "></c:out></td>
											<td><c:out value="${fruit.price} "></c:out></td>
										</tr>
									</c:when>
									<c:otherwise>
										<tr>
											<td><c:out value="${fruit.name} "></c:out></td>
											<td><c:out value="${fruit.price} "></c:out></td>
										</tr>
									</c:otherwise>

								</c:choose>

							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>




</body>
</html>