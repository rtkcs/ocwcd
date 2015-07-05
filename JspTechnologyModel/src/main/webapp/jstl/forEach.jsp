<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:forEach</title>
</head>
<body>
	<h2>c:forEach</h2>
	
<%
String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
request.setAttribute("numbers", numbers);
%>
	<table>
	
	<c:forEach var="number" items="${numbers}" varStatus="count">
		<tr>
			<td>
				<c:out value="${count.count}"/>
			</td>
			<td>
				<c:out value="${number}"/>
			</td>
		</tr>
	</c:forEach>	
	</table>
	
	<h2>Nesting c:forEach</h2>
<%
String[] days = {"moday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
String[] months = {"January", "February", "March", "April", "May", "Juny", "July", "August", "September", "October", "November", "December"};
java.util.List<String[]> list = new java.util.ArrayList<String[]>();
list.add(days);
list.add(months);
request.setAttribute("list", list);
%>
	
	
	<c:forEach var="listElement" items="${list}" varStatus="listElementCount">
		<table>
			<c:forEach var="item" items="${listElement}" varStatus="itemCount">
				<tr>
					<td>
						<c:out value="${listElementCount.count}"/>
					</td>
					<td>
						<c:out value="${itemCount.count}"/>
					</td>
					<td>
						<c:out value="${item}"/>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:forEach>	
	
	<h2>c:forEach with begin, end, step and varStatus</h2>
	
	<table>
		<c:forEach var="number" items="${numbers}" begin="1" end="9" step="2" varStatus="count">
			<tr>
				<td><c:out value="${count.count}"/></td>
				<td><c:out value="${number}"/></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>