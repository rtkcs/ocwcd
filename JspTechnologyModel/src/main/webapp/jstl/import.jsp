<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL c:import</title>
</head>
<body>
	<h2>c:import</h2>


<c:import url="https://www.google.com" />
<%--
<img src="<c:import url='http://s.ytimg.com/yts/imgbin/www-hitchhiker-vfl1WP9DO.webp' />" />
 --%>
 
 	<h2>c:import importing if.jsp with parameter</h2>
 
 <c:import url="if.jsp">
 	<c:param name="member" value="true"/>
 </c:import>

</body>
</html>