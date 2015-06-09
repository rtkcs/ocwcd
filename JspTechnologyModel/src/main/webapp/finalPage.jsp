<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Iterator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Final Page</title>
</head>
<body>
<p>
These friends <%--  <%=((List<String>)request.getAttribute("friends")).toString() %> <br/> --%>
<% 	List<String> list =  (List<String>)request.getAttribute("friends");
	int i = list.size();
	for(int x=0; x<i; x++){
		out.print(list.get(x));
		
		if(x < i-2){
			out.print(", ");
		}
		if(x == i-2){
			out.print(" and ");
		}
	}

%>
are learning for the 
<%=request.getParameter("exam") %>
exam.
</p>
<p>
<% 	Iterator<String> it = list.iterator();
	while(it.hasNext()){ %>
	<%= it.next() %> <br/>
	
<% } %>
</p>

</body>
</html>