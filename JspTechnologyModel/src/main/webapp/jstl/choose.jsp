<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:choose c:when c:otherwise</title>
</head>
<body>
	<h2>c:choose c:when c:otherwise</h2>

<c:choose>
	<c:when test="${param.member}">
		<p>Welcome member of the JSTL !</p>
	</c:when>
	<c:otherwise>
		<p>Sorry you are not a member of the JSTL !</p>
	</c:otherwise>
</c:choose>


<form action="choose.jsp">
	<p>	Are you a member of JSTL ?
		<input type="checkbox" name="member" value="true"/>
	</p>
	<input type="submit" value="Submit" />

</form>

</body>
</html>