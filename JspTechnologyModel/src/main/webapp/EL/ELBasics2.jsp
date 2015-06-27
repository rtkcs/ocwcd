<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Basics II. Implicit Objects</title>
</head>
<body>
<h1>EL Implicit Objects</h1>

<h2>Map Objects</h2>
<ul>
	<li>pageScope = ${pageScope}<br></li>
	<li>requestScope = ${requestScope}<br></li>
	<li>sessionScope = ${sessionScope}<br></li>
	<li>applicationScope = ${applicationScope}<br></li>
	<li>param = ${param}<br></li>
	<li>paramValues = ${paramValues}<br></li>
	<li>header = ${header}<br></li>
	<li>headerValues = ${headerValues}<br></li>
	<li>cookie = ${cookie}<br></li>
	<li>initParam = ${initParam}<br></li>
	<li>pageContext = ${pageContext}<br></li>
</ul>

<h2>paramValues</h2>
<ul>
	<li>param.name = ${param.name}</li>
	<li>paramValues.name[0] = ${paramValues.name[0]}</li>
	<li>paramValues.name[1] = ${paramValues.name[1]}</li>
	<li>param.film = ${param.film}</li>
	<li>paramValues.film[0] = ${paramValues.film[0]}</li>
</ul>


<h2>header</h2>

<ul>
	<li>header.host = ${header.host}</li>
	<li>header["host"] = ${header["host"]}</li>
	<li>header.user-agent = ${header.user-agent}</li>
	<li>header["user-agent"] = ${header["user-agent"]}</li>
</ul>


<h2>pageContext</h2>

<ul>
	<li>pageContext.request.method = ${pageContext.request.method}</li>
	<li>pageContext.response.characterEncoding = ${pageContext.response.characterEncoding}</li>
	<li>pageContext.out = ${pageContext.out}</li>
	<%-- 
	<li>pageContext.eLContext = ${pageContext.eLContext}</li> --%>
	<li>pageContext.errorData = ${pageContext.errorData}</li>
	<li>pageContext.exception = ${pageContext.exception}</li>
	<li>pageContext. = ${pageContext.page}</li>
	<li>pageContext. = ${pageContext.request}</li>
	<li>pageContext. = ${pageContext.response}</li>
	<li>pageContext. = ${pageContext.servletConfig}</li>
	<li>pageContext. = ${pageContext.servletContext}</li>
	<li>pageContext. = ${pageContext.session}</li>
</ul>


<h2>Cookie</h2>

<ul>
	<li>cookie.JSESSIONID.value = ${cookie.JSESSIONID.value}</li>
	<li>cookie["com.springsource.sts.run.embedded"].value = ${cookie["com.springsource.sts.run.embedded"].value}</li>
</ul>

<h2>initParam - application context parameters</h2>

<ul>
	<li>initParam.contextConfigLocation = ${initParam.contextConfigLocation}</li>
	<li>initParam["contextConfigLocation"] = ${initParam["contextConfigLocation"]}</li>
</ul>

</body>
</html>
