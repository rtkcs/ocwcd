<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="int" uri="RandomIntegerGenerator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL Basics III. EL Functions</title>
	</head>
	<body>
		<h1>EL Functions</h1>
		
		<h2>Random Integer Generator</h2>
		<ul>
			<li>int:getInt = ${int:getInt()}<br></li>
			<li>int:getInt(100) = ${int:getMaxInt(100)}<br></li>
		</ul>
		
		<h2>Placeholder</h2>
		<ul>
			<li> = ${param}</li>
			<li> = ${param}</li>
			<li> = ${param}</li>
			<li> = ${param}</li>
			<li> = ${param}</li>
		</ul>
	
	
	</body>
</html>
