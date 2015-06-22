<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going from the request to the JSP without going through a servlet I.</title>
</head>
<body>
	<jsp:useBean id="myPet" type="eu.rtakacs.jsp.domain.Animal" class="eu.rtakacs.jsp.domain.Pet">
		<jsp:setProperty name="myPet" property="name" param="petName"/>
		<jsp:setProperty name="myPet" property="type" param="petType"/>
	</jsp:useBean>
	
	My pet name is <b><jsp:getProperty name="myPet" property="name"/></b>
	and it is a <b><jsp:getProperty name="myPet" property="type"/></b>.
	

</body>
</html>