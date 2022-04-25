<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<!-- for Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="js/app.js"></script>
		
		<title>Omikuji</title>
	</head>
<body>
	<h1 id="index-header">Send an Omikuji!</h1>
	<div class="input-form m-3 p-5">
	<form action="/processForm" method="POST">
		<div>
			<label>Pick any number from 5 to 25</label><br>
			<input class="numberInput border-dark" type="number" name="number"/>
		</div>
		<br>
		<div>
			<label>Enter the name of any city.</label><br>
			<input class="border-dark" type="text" name="city"/>
		</div>
		<br>
		<div>
			<label>Enter the name of any real person</label><br>
			<input class="border-dark" type="text" name="person"/>
		</div>
		<br>
		<div>
			<label>Enter professional endeavor or hobby</label><br>
			<input class="border-dark" type="text" name="hobby"/>
		</div>
		<br>
		<div>
			<label>Enter any type of living thing.</label><br>
			<input class="border-dark" type="text" name="living"/>
		</div>
		<br>
		<div>
			<label>Say something nice to someone:</label><br>
			<textarea class="border-dark" name="comment" cols="30" rows="5"></textarea><br>
		</div>
		<br>
		<div>
			<label>Send and show a friend</label><br>
			<input class="button btn-dark font-light" type="submit" value="Send"/>
		</div>
		
	</form>
		
		
	</div>

</body>
</html>