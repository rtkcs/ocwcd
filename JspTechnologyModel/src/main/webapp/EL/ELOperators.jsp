<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="int" uri="RandomIntegerGenerator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL Basics III. EL Functions</title>
	</head>
	<body>
		<h1>EL Operators</h1>
		
		<h2>Arithmetic</h2>
		<ul>
			<li>5 + 5 = ${5 + 5}</li>
			<li>5 - 4 = ${5 - 4}</li>
			<li>5 * 5 = ${5 * 5}</li>
			
			<li>10 / 5 = ${10 / 5}</li>
			<li>10 div 5 = ${10 div 5}</li>
			<li> 0 / 5 = ${0 / 5}</li>
			
			<li>11 % 5 = ${11 % 5}</li>
			<li>11 mod 5 = ${11 mod 5}</li>
		</ul>
		
		<h2>Logical</h2>
		<ul>
			<li>true && true = ${true && true}</li>
			<li>true and true = ${true and true}</li>
			
			<li>true || false = ${true || false}</li>
			<li>true or false = ${true or false}</li>
			
			<li>!true = ${!true}</li>
			<li>not true = ${not true}</li>
		</ul>
		
		<h2>Relational</h2>
		<ul>
			<li>1 == 1 = ${1 == 1}</li>
			<li>1 eq 1 = ${1 eq 1}</li>
			
			<li>1 != 1 = ${1 != 1}</li>
			<li>1 ne 1 = ${1 ne 1}</li>
			
			<li>1 < 1 = ${1 < 1}</li>
			<li>1 lt 1 = ${1 lt 1}</li>
			
			<li>1 > 1 = ${1 > 1}</li>
			<li>1 qt 1 = ${1 gt 1}</li>

			<li>1 <= 1 = ${1 <= 1}</li>
			<li>1 le 1 = ${1 le 1}</li>
			
			<li>1 >= 1 = ${1 >= 1}</li>
			<li>1 ge 1 = ${1 ge 1}</li>
		</ul>		
	
	
	</body>
</html>
