<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>



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
<script type="text/javascript" src="/js/app.js"></script>
</head>

<body>
	<div class="header">
		<div class="goal_div">
			<h1>Your Gold:</h1>
			<h1 class="goal"> <c:out value="${goldCount}"></c:out> </h1>
		</div>
		<div>
			<a href="/Reset" class="btn btn-outline-danger"> Reset</a>
		</div>
	</div>
	<hr class="mx-5 my-3 myhr_color">
	<div class="row my-5 mx-5 ">
		<div class="col-md my-1 ">
			<div class="card border-dark h-100" >
				<div class="card-body text-center">
					<h5 class="card-title">Farm</h5>
					<h6 class="card-subtitle mb-2 text-muted">( earns 10-20 gold )</h6>
					<form action="/getRandom" method="post">
						<input type="hidden" name="goldFrom" value="farm">
						<button type="submit" class="btn  btn-outline-dark mt-3">Find
							Gold!</button>
					</form>
				</div>
			</div>
		</div>

		<!-- --------------------------------------------------------- -->
		<div class="col-md my-1 ">
			<div class="card border-dark h-100">
				<div class="card-body text-center">
					<h5 class="card-title">Cave</h5>
					<h6 class="card-subtitle mb-2 text-muted">( earns 5-10 gold )</h6>
					<form action="/getRandom" method="post">
						<input type="hidden" name="goldFrom" value="cave">
						<button type="submit" class="btn  btn-outline-dark mt-3">Find
							Gold!</button>
					</form>
				</div>
			</div>
		</div>

		<!-- --------------------------------------------------------- -->
		<div class="col-md my-1 ">
			<div class="card border-dark h-100">
				<div class="card-body text-center">
					<h5 class="card-title">House</h5>
					<h6 class="card-subtitle mb-2 text-muted">( earns 2-5 gold )</h6>
					<form action="/getRandom" method="post">
						<input type="hidden" name="goldFrom" value="house">
						<button type="submit" class="btn  btn-outline-dark mt-3">Find
							Gold!</button>
					</form>
				</div>
			</div>
		</div>
		<!-- --------------------------------------------------------- -->
		<div class="col-md my-1 ">
			<div class="card border-dark h-100">
				<div class="card-body text-center">
					<h5 class="card-title">Quest</h5>
					<h6 class="card-subtitle mb-2 text-muted">( earns/takes 0-50
						gold )</h6>
					<form action="/getRandom" method='post'>
						<input type="hidden" name="goldFrom" value="quest">
						<button type="submit" class="btn  btn-outline-dark">Find
							Gold!</button>
					</form>
				</div>
			</div>
		</div>
		<!-- --------------------------------------------------------- -->
		<div class="col-md my-1 ">
			<div class="card border-dark h-100">
				<div class="card-body text-center">
					<h5 class="card-title">Spa</h5>
					<h6 class="card-subtitle mb-2 text-muted">( earns/takes 5-20
						gold )</h6>
					<form action="/getRandom" method='post'>
						<input type="hidden" name="goldFrom" value="spa">
						<button type="submit" class="btn  btn-outline-dark">Find
							Gold!</button>
					</form>
				</div>
			</div>
		</div>
		<!-- --------------------------------------------------------- -->
	</div>
	<hr class="mx-5 my-2 myhr_color">
	<div class="activity my-2 mx-5" >
		<h4>Activities :</h4>
		<div>
			<c:forEach var="log" items="${goldLog}">
			 <c:choose>
			 		<c:when test='${log.contains("earned")}'>
			 			<p class="win"><c:out value="${log}"></c:out></p>
			 		</c:when>
			 		<c:otherwise>
			 			<p class="failed"><c:out value="${log}"></c:out></p>
			 		</c:otherwise>
			 </c:choose>
				
			</c:forEach>
		</div>
	</div>
</body>

</html>