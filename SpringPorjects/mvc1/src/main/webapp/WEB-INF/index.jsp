<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Books</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<header class="main_header">
		<h1>All Book:</h1>
		<div>
			<a href="/books/new">New Book</a>
		</div>
	</header>
	<hr>
	<table>
		<thead>
			<tr></tr>
			<th>Title</th>
			<th>Description</th>
			<th>Num Of Pages</th>
			<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><a href="/books/${book.id}">${book.title}</a></td>
					<td>${book.description}</td>
					<td>${book.numberOfPages}</td>
					<td class="action"><%-- <a href="/book/${book.id}/edit"> Edit </a> --%>
						<form action="/books/${book.id}/edit" method="get">
							<button type="submit">edit</button>
						</form>
						<form action="/books/${book.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<button type="submit">del</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>