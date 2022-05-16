<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Book Club - Dashboard</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div class="page-container">
	<nav class="d-flex justify-content-between align-items-center col-12">
		<div>
			<h1 style="color:purple">Welcome ${user.userName} </h1>
			<h3 style="color:slategrey">Books from everyone's shelves:</h3>
		</div>
		<div class="d-flex col-2 row m-4">
			
			<a href="/logout" class="btn border-secondary text-secondary p-2">Logout</a>
			<a href="books/new" class="btn border-success text-success p-2">+ Add a book to my shelf!</a>
		</div>
	</nav>
	<hr><br>
	
	<table class="table">
		<thead>
			<tr>
				<th scope="col">IDs</th>
				<th scope="col">Title</th>
				<th scope="col">Author Name</th>
				<th scope="col">Posted By</th>
			</tr>
		</thead>			
		<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.id}</td>
				<td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
				<td>${book.authorName}</td>
				<td>${book.user.userName}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>