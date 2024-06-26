<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
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
		<div class="col-md-6  p-3">
			<h1>Send an Omikuji</h1>
			<div class="card border-dark">
				<div class=card-body>
					<form action="/create" method="post">
						<table class="table table-sm mx-5 my-0">
							<tbody>
								<tr>
									<td>Pick any number from 5 to 25</td>
								</tr>
								<tr >
									<td><input class="w-25 border-dark" type="number" min="5" max="25"
										value="0" name="pick_num"></td>
								</tr>

								<tr>
									<td>Enter the name of any city:</td>
								</tr>
								<tr>
									<td><input class="border-dark" type="text" name="city"></td>
								</tr>

								<tr>
									<td>Enter the name of any real person :</td>
								</tr>
								<tr>
									<td><input  class="border-dark" type="text" name="person"></td>
								</tr>
								
								<tr>
									<td>Enter professional endeavor or hobby:</td>
								</tr>
								<tr>
									<td><input  class="border-dark" type="text" name="hobby"></td>
								</tr>
								
								<tr>
									<td>Enter any type of living thing:</td>
								</tr>
								<tr>
									<td><input  class="border-dark" type="text" name="living"></td>
								</tr>
								
								<tr>
									<td>Say something nice to someone:</td>
								</tr>
								<tr>
									<td><input  class="border-dark" type="text" name="someone"></td>
								</tr>
							</tbody>
						</table>
						
						<p class="mx-5 ">Send show a frind</p>
						<div class=" mx-5 d-flex justify-content-end">
							<button type="submit" class="btn mybtn">Send</button>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>