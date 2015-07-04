<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Include page directive and include standard action</title>
	</head>
	<body>
	
	<h2>Include directive < %@ include file = ""  %></h2>
	
	<%@ include file="header.jsp" %>
	<%@ include file="header.html" %>
	
	
	
	<h2>Include standard action < jsp:include page = " " / ></h2>
	
	<jsp:include page="footer.jsp">
		<jsp:param name="paramForFooter" value="This parameter is processed every time this page is loaded."/>
	</jsp:include>


	</body>
</html>