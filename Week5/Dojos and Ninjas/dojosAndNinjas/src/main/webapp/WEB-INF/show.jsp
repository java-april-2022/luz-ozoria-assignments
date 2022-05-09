<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="js/app.js"></script>
		
		<title>Show Dojo</title>
	</head>
<body class="container">
	<nav class="navbar">
		<h1>${ dojo.name } Location Ninjas</h1>
		<a href="/dojos/new" class="link">Add a New Dojo</a>
	</nav>
	
	
	<div class="container" style="border: 1px solid DarkSlateGrey; padding: 30px">
		<table class="table table-success table-striped">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ ninjas }" var="ninja">
			<tr>
				<td>${ ninja.firstName }</td>
				<td>${ ninja.lastName }</td>
				<td>${ ninja.age }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>

</body>
</html>