<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello World</h3>
	<% for(int i =0 ; i< 5 ; i++){ %>
		<h1><%= i %></h1>
	<%} %>
	<h2>The Time is : <%= new Date() %> </h2>
	<h1>Two plus two is: </h1>
<h2><c:out value="${2+2}"/></h2>

<h1>Fruit of the Day</h1>
<h2><c:out value="${fruit}"/></h2>

</body>
</html>