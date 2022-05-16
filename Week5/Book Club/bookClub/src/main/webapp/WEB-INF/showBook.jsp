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
<body id="show-page">
	<div class="page-container">
		<nav class="d-flex justify-content-between align-items-center col-12">
			<div>
				<h1 style="color:purple"><c:out value="${book.title}"></c:out></h1>
			</div>
			<div class="d-flex col-2 row m-4">
				<a href="/home" class="link">back to the shelves</a>
			</div>
		</nav>
		<hr>
		
		<c:choose>
			<c:when test="${userID==book.user.id}">
				<h3 style="color:darkKhaki">You read ${book.title} by ${book.authorName}</h3>
				<hr>
					<h4 style="color:slategrey">Here were your thoughts:</h4>
			</c:when>
			<c:otherwise>
				<h3 style="color:darkKhaki"><c:out value="${book.user.userName} "></c:out>read <c:out value="${book.title}"></c:out> by <c:out value="${book.authorName}"></c:out></h3>
				<h4 style="color:slategrey">Here are <c:out value="${book.user.userName}"></c:out>'s thoughts:</h4>
			</c:otherwise>			
		</c:choose>
		<hr>
			<p style="color:slategrey; font-style: italic;"><c:out value="${book.myThoughts}"></c:out>
		<hr>
		<c:choose>
			<c:when test="${user == book.user}">
				<a href="/books/${book.id}/edit" class="btn border-secondary text-secondary p-2">Edit</a>
			</c:when>
		</c:choose>
		
		
		
	</div>

</body>
</html>