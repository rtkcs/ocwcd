<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page import="java.util.Date" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Hello Session!</h1>

<P>  The time on the server is ${serverTime}.</P>

Session<br/> 
Creation Time: <%=new Date(session.getCreationTime()) %><br/>
Last Accessed Time: <%=new Date(session.getLastAccessedTime()) %><br/>
Max Inactive Interval: <%=session.getMaxInactiveInterval() %> s <br/>
<a href="spring?invalidateSession=true">Invalidate Session</a><br/><br/>
<a href="<c:url value="/SessionServletFirst" />">Go to SessionServletFirst</a>

<form action="spring">
	Set Http Session Max Inactive Interval (in s)<input type="text" name="sessionInactiveInterval"/>
	<input type="submit" value="Submit"/>
</form>

</body>
</html>
