<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Show</title>
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
</head>
<body>
	<div class="row d-flex justify-content-center">
		<h1 class="text-center mt-2">Here's Your Omikuji</h1>
		<div class="col-md-4  p-3">

			<div class="card border-dark myback">
				<div class=card-body>
					<h2>In ${pick_num} ,you will live in ${city} with ${person} as
						your roommate, ${hobby} for a living. The next time you see a
						${living},you will have good luck. Also, ${someone}</h2>
				</div>
			</div>
		</div>
		
	</div>
	<div class="d-flex justify-content-center">
	<a class=" btn btn-warning " href="/omikuji/reset"> Go Back </a>
	</div>
	
</body>
</html>