<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:forTokens</title>
</head>
<body>
	<h2>c:forTokens</h2>
	
<%
String numbers = "zero,one,two,three,four,five,six,seven,eight,nine";
request.setAttribute("numbers", numbers);
%>
	<table>
	
	<c:forTokens var="number" items="${numbers}" varStatus="count" delims=",">
		<tr>
			<td>
				<c:out value="${count.count}"/>
			</td>
			<td>
				<c:out value="${number}"/>
			</td>
		</tr>
	</c:forTokens>	
	</table>
	
	<h2>Nesting c:forTokens</h2>
<%
String days = "moday,tuesday,wednesday,thursday,friday,saturday,sunday";
String months = "January,February,March,April,May,Juny,July,August,September,October,November,December";
java.util.List<String> list = new java.util.ArrayList<String>();
list.add(days);
list.add(months);
request.setAttribute("list", list);
%>
	
	
	<c:forTokens var="listElement" items="${list}" varStatus="listElementCount" delims=",">
		<table>
			<c:forTokens var="item" items="${listElement}" varStatus="itemCount" delims=",">
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
			</c:forTokens>
		</table>
	</c:forTokens>	
	
	<h2>c:forTokens with begin, end, step and varStatus</h2>
	
	<table>
		<c:forTokens var="number" items="${numbers}" begin="1" end="9" step="2" varStatus="count" delims=",">
			<tr>
				<td><c:out value="${count.count}"/></td>
				<td><c:out value="${number}"/></td>
			</tr>
		</c:forTokens>
	</table>
	
</body>
</html>