<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page import="eu.rtakacs.jsp.PageViewCounter" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>JSP Technology Model with Page Expresions</h1>

<P>  The time on the server is ${serverTime}. </P>
<br />
<ul>
	<li>This page was viewed <% out.print(PageViewCounter.getCount()); %> --scpriptlet code  <b><\% out.print(PageViewCounter.getCount()); %></b></li>
	<li>This page was viewed <%=PageViewCounter.getCount() %> --expression code, <b><\%=PageViewCounter.getCount() %></b> --argument to out.print()</li>
</ul>
<br />

<%= 27 %><br />
<%= ((Math.random() + 5)*2) %><br />
<%= "27" %><br />
<%= Math.random() %><br />
<%= "foo" %><br />
<%= new String[3] %><br />
<%= 42*20 %><br />
<%= 5>3 %><br />
<%= false %><br />
<%= new PageViewCounter()%><br />
</body>
</html>
