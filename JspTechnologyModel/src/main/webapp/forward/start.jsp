<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Start Page for Forward</title>
</head>
<body>
	
	<h2>Forward Start</h2>
	
	<c:if test="${empty param.name}">

		<jsp:forward page="stop.jsp">
			<jsp:param name="reason" value="No Name"/>
		</jsp:forward>
		
	</c:if>
	
	<p>Welcome ${param.name} !</p>
</body>
</html>