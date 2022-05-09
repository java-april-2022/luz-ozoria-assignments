<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<nav class="navbar">
		<h1>New Dojo</h1>
		<a href="/ninjas/new" class="link">Add a Ninja</a>
	</nav>
	<div class="form-box">
		<form:form action="/dojo/create" method="POST" modelAttribute="newDojo">
			<div class="row mb-3">
				<form:errors path="name" class="text-danger"/>
				<form:label path="name" class="h3 success">Name:</form:label>
				<div class="col-sm-8">
					<form:input path="name" class="form-control"/>
				</div>
			</div><br>
			<button class="btn btn-primary">Create</button>
		</form:form>
	</div>
</div>
</body>
</html>