<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:url</title>
</head>
<body>
	<h2>c:url</h2>


	<c:url value="/index.html" var="index"/>
	The <a href="${index}">index.html</a> url is: ${index}

 	
 	<h2>c:url with no encodig</h2>
 	<c:set var="firstParam" value="Oracle Certified Web Compoment Developer"/>
 	<c:set var="lastParam" value="Oracle Certified Prosessional"/>
 	<c:url value="/index.html?first=${firstParam}&second=${lastParam}" var="indexNonEncoded"/>
 	The <a href="${indexNonEncoded}">index.html</a> url no encoded is: ${indexNonEncoded}
 	
 	<h2>c:url with encodig</h2>
 	<c:set var="firstParam" value="Oracle Certified Web Compoment Developer"/>
 	<c:set var="lastParam" value="Oracle Certified Prosessional"/>
 	<c:url value="/index.html?first=${firstParam}&second=${lastParam}" var="indexNonEncoded">
 		<c:param name="first" value="${firstParam}"/>
 		<c:param name="last" value="${lastParam}"/>
 	</c:url>
 	The <a href="${indexNonEncoded}">index.html</a> url no encoded is: ${indexNonEncoded}
 

</body>
</html>