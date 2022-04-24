<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hopper's Receipt</title>
</head>
<body>
	<h1><c:out value="${name}"/></h1>
	<h3><c:out value="${itemName}"/></h3>
	<p><c:out value="${price}"/></p>
	<p><c:out value="${description}"/></p>
	<p><c:out value="${vendor}"/></p>
</body>
</html>