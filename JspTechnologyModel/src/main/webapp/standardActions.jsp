<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jsp:useBean jsp:getProperty jsp:setProperty</title>
</head>
<body>

	<jsp:useBean id="myPet" class="eu.rtakacs.jsp.domain.Pet" scope="request" />
	<p>My pet name is <jsp:getProperty property="name" name="myPet" /></p>
	
	<!-- new bean is constructed and initialized only if it si not existing in the request-->
	<jsp:useBean id="myFriendsPet" class="eu.rtakacs.jsp.domain.Pet" scope="request">
		<!-- property values will be set only if a new bean is created -->
		<jsp:setProperty property="name" value="Tweety" name="myFriendsPet"/>
		<jsp:setProperty property="type" value="Canary" name="myFriendsPet"/>
	</jsp:useBean>
	
	<p>My friends pet name is <jsp:getProperty property="name" name="myFriendsPet" />
	and is a <jsp:getProperty property="type" name="myFriendsPet"/>
	</p>
	
	<!-- type and class attributes -->
	<!-- If type is used without class, the bean must already exist. -->
	<!-- If class is used (with or without type) the class must NOT be abstract, and must have a public no-arg constructor. -->
	<jsp:useBean id="pet" class="eu.rtakacs.jsp.domain.Pet" type="eu.rtakacs.jsp.domain.Animal" scope="page">
	
	</jsp:useBean>

</body>
</html>