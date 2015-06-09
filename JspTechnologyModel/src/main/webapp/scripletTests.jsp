<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Scriplet Tests</title>
</head>
<body>
	<p>
	<% 	int x = 1; %>
	<% 	int y = x + 2; %>
	<%=	y %>
	</p>
	<p>
	<% 	ArrayList<String> al = new ArrayList<String>();
		al.add("string");
	%>
	<%=	al.get(0) %>
	</p>
	<p>
	<%! int a = 11; %>
	<%	int a = 22; %>
	<%= a %>
	</p>
</body>
</html>