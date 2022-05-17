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
		
		<title>Book Club - Add</title>
	</head>
<body>
<div class="container">
	<nav class="d-flex justify-content-between align-items-center col-12">
		<div>
			<h1 style="color:purple">Add a Book to Your Shelf!</h1>
		</div>
		<div class="d-flex col-2 row m-4">
				<a href="/home" class="link">back to the shelves</a>
		</div>
	</nav>
	<hr>
	
	<div class="container">
		<form:form action="/books/add" method="POST" modelAttribute="newBook">
			<div class="form-group">
				<form:label for="title" path="title">Title:</form:label>
					<form:input type="text" path="title" class="form-control"/>
					<form:errors path="title" style="color:red"/>
			</div><br>
			<div class="form-group">
				<form:label for="author" path="author">Author:</form:label>
					<form:input type="text" path="author" class="form-control"/>
					<form:errors path="author" style="color:red"/>
			</div><br>
			<div class="form-group">
				<form:label for="comment" path="comment">My Thoughts:</form:label>
					<form:textarea type="text" path="comment" class="form-control"/>
					<form:errors path="comment" style="color:red"/>
			</div><br>
			<div>
				<form:hidden path="user" value="${ sessionId }"/>
				<input type="submit" value="Submit" style="width:125px;" style="border:2px solid purple"/>
			</div><br>
		</form:form>
	</div>
</div>
</body>
</html>