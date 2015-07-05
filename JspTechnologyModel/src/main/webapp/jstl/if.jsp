<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:if</title>
</head>
<body>
	<h2>c:if</h2>
<%
boolean member = true;
request.setAttribute("member", member);
%>

<c:if test="${param.member}">
	<p>Welcome member of the JSTL !</p>
</c:if>
<c:if test="${!param.member}">
	<p>Sorry you are not a member of the JSTL !</p>
</c:if>

<form action="if.jsp">
	<p>Are you a member of JSTL ?
	<input type="checkbox" name="member" value="true"/></p>
	<input type="submit" value="Submit" />

</form>

</body>
</html>