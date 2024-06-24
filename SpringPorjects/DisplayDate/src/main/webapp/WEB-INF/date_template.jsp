<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Template</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/date_temp.js"></script>
</head>
<body>
	 <div id="main_time">
	 <h1> <c:out value="${date}"></c:out>  </h1>
	</div>
</body>
</html>