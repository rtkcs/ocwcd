<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>InitParamControllerSpring</title>
</head>
<body>
<h1>
	InitParamControllerSpring  
</h1>

<P>  The time on the server is ${serverTime}. </P>
Email: ${email}<br>
Init Param Names: ${initParameterNames}<br>
sales email: ${salesEmail}<br>
In the servletContext we have a Lion with a breed of: ${lion.breed}
</body>
</html>
