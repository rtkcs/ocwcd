<%@ page import="eu.rtakacs.jsp.domain.Pet" %>
<%@ page import="eu.rtakacs.jsp.domain.PetType" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:set</title>
</head>
<body>
	<h2>c:set</h2>

<%
	String name = "Dick Tracy";
	request.setAttribute("name", name);
%>
	
	<c:set var="sessionScopedVariable" scope="session" value="Hello from Session !"/>
	<c:set var="detective" value="${name}" />
	
	<c:set var="requestScopedVariable" scope="request">
		Hello from Request !
	</c:set>
	
	<c:out value="${sessionScopedVariable}"/><br>
	<c:out value="${requestScopedVariable}"/><br>
	<c:out value="${detective}"/><br>


<%
	Pet pet = new Pet();
	pet.setName("Benji");
	pet.setType(PetType.Dog);
	request.setAttribute("dog", pet);
%>

	<c:set target="${dog}" property="name" value="Goro"/>
	<c:out value="${dog.name}"/><br>

	<c:set target="${dog}" property="name">
		Boby
	</c:set>
	<c:out value="${dog.name}"/><br>
	
	
	<h2>c:remove</h2>
	<c:out value="${dog}"/><br>
	<c:remove var="dog" scope="request"/>
	<c:out value="${dog}"/><br>
</body>
</html>