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
		
		<title>Read Share</title>
	</head>
<body>
	<div class="page-container">
		<nav class="header">
			<h1 style="color:purple">Change your Entry</h1>
			<a href="/home" class="link">back to the shelves</a>
			<hr>
		</nav>
		
		<div class="container">
			<form:form action="/books/${book.id}" modelAttribute="book" class="form" method="post">
				<input type="hidden" name="_method" value="put"/>
			
				<div class="form-row">
				 	<form:errors path="title" class="error"/>
					<form:label for="title" path="title">Title:</form:label>
					<form:input type="text" path="title" class="form-control"/>
				</div>
				
				<div class="form-row">
					<form:errors path="authorName" class="error"/>
					<form:label for="authorName" path="authorName">Author:</form:label>
					<form:input type="text" path="authorName" class="form-control"/>
				</div>
				
				<div class="form-row">
					<form:errors path="myThoughts" class="error"/>
					<form:label for="myThoughts" path="myThoughts">Thoughts:</form:label>
					<form:textarea path="myThoughts" class="form-control"/>
				</div>
				
				<div class="form-row">
					<form:errors path="user" class="error"/>
					<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>
				</div>
				
				<div class="form-row">
					<input type="submit" value="Submit" class="btn-primary"/>
				</div>
				
			</form:form>
		</div>
		
	</div>