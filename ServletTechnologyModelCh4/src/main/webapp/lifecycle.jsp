<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lifecycle</title>
</head>
<body>
	<form action="lifecycle" method="post">
		Name: <input type="text" name="name"/><br />
		Colors:<br />
		<input type="checkbox" name="color" value="Red" />Red<br />
		<input type="checkbox" name="color" value="Green" />Green<br />
		<input type="checkbox" name="color" value="Blue" />Blue<br /><br />
		<input type="submit"  value="submit POST request"><br />
	</form>
	<br />
	<a href="lifecycle?id=1">Download file <b>junit-4.8.2.jar</b></a><br />
	<a href="lifecycle?id=2">Send redirect to <b>www.popsci.com</b></a><br />
	<a href="lifecycle?id=3">Send redirect to <b>download.jsp</b></a><br />
	<a href="lifecycle?id=4">Send redirect to <b>/</b></a><br />
	<a href="lifecycle?id=5">Dispatch the request to <b>download.jsp</b></a><br />
	<a href="lifecycle?id=6">Dispatch the request to servlet <b>/</b></a><br />
	<a href="lifecycle?id=7">Get Error 503</a><br />
	<a href="lifecycle">Print header <b>User-Agent</b></a><br />
	

</body>
</html>