<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Counter</title>
</head>
<body>
<%!

int counter(){
	return ++countInFunction;
}
int countInFunction = 0;

%>


<h1>JSP Page with own Variables</h1>

<%! int count=0; %><%-- declaration --%>
<%  int badCounter=0; %><%--scriptlet --%>
This page is viewed <%= ++count %> times.<br />
This page is viewed <%= ++badCounter %> times (bad counter).<br />
This page is viewed <%= counter() %> times (function call counter()).<br />

</body>
</html>