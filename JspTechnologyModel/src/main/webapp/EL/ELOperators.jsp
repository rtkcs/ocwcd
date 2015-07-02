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
		
		<h2>Excercise</h2>
<%
String num = "2";
request.setAttribute("num", num);
Integer i = new Integer(3);
request.setAttribute("integer", i);
java.util.ArrayList list = new java.util.ArrayList();
list.add("true");
list.add("false");
list.add("2");
list.add("10");
request.setAttribute("list", list);

%>

String num = "2";<br>
request.setAttribute("num", num);<br>
Integer i = new Integer(3);<br>
request.setAttribute("integer", i);<br>
java.util.ArrayList list = new java.util.ArrayList();<br>
list.add("true");<br>
list.add("false");<br>
list.add("2");<br>
list.add("10");<br>
request.setAttribute("list", list);<br><br><br>

<ul>
	<li>num > 3 = ${num > 3}</li>
	<li>integer le 12 = ${integer le 12}</li>
	<li>requestScope["integer"] ne 4 and 6 le num || false = ${requestScope["integer"] ne 4 and 6 le num || false}</li>
	<li>list[0] || list["1"] and true = ${list[0] || list["1"] and true}</li>
	<li>num > integer = ${num > integer}</li>
	<li>num == integer - 1 = ${num == integer - 1}</li>
	<li>42 div 0 = ${42 div 0}</li>
<%--	
	<li>${}</li>
	<li>${}</li>
	<li>${}</li>
		 --%>
</ul>
	
	
	</body>
</html>
