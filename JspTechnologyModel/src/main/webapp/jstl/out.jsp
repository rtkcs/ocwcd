<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:out</title>
</head>
<body>
	<h2>JSTL c:out</h2>

<p><c:out value="<b>Bold</b> tags write things bold"/></p>

<p><c:out value="${nonExistingBean}" default="This is default text." /></p>

<p><c:out value="<b>Bold</b>" default="Bold" escapeXml="false" /></p>

<p>
<c:out value="${nonExistingBean}" escapeXml="false" >
	<b>Bold long default text.</b>
</c:out>
</p>


</body>
</html>