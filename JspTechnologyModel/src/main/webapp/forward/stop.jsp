<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stop Page for Forward</title>
</head>
<body>

	<form method="get" action="start.jsp">
		<h2>Forward Stop</h2>	
		<p>You were redirected here because of ${param.reason}</p>
	
		Name: <input type="text" name="name" />
		<input type="submit" name="Submit"/>
	
	</form>
</body>
</html>