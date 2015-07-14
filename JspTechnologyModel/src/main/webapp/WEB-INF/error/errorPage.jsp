<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>General Error Page</title>
</head>
<body>
	<h1>General Error Page</h1>

	<p>${pageContext.exception}</p>
	<p>${pageContext.exception.message}</p>
	
</body>
</html>