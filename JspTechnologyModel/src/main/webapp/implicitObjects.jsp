<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.io.IOException" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page with Implicit Objects</title>
</head>
<body>

<h1>JSP Page with Implicit Objects</h1>

<ul>
	<li>JspWriter 				out</li>
	<li>HttpServletRequest		request</li>
	<li>HttpServletResponse		response</li>
	<li>HttpSession				session</li>
	<li>ServletContext			application</li>
	<li>ServletConfig			config</li>
	<li>Throwable				exception</li>
	<li>PageContext				pageContext</li>
	<li>Object					page</li>
</ul>

<%! 

public void jspInit(){
	//super.jspInit();
}

private void printAttributeNames(Enumeration<String> e, JspWriter out, String scope) throws IOException{
	out.print("Attribute Names from " + scope +": <br/>");
	while(e.hasMoreElements()){
		out.println(e.nextElement() + "<br/>");
	}	
	out.print("<br/>");
}
%>

<%
request.setAttribute("requestAttr", "request");
session.setAttribute("sessionAttr", "session");
application.setAttribute("applicationAttr", "application"); //servletContext.setAttribute();
pageContext.setAttribute("pageContextAttr", "pageContext");


pageContext.setAttribute("pageContext", "REQUEST_SCOPE", PageContext.REQUEST_SCOPE);
pageContext.setAttribute("pageContext", "SESSION_SCOPE", PageContext.SESSION_SCOPE);
pageContext.setAttribute("pageContext", "APPLICATION_SCOPE", PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("pageContext", "PAGE_SCOPE", PageContext.PAGE_SCOPE);

Enumeration<String> ee = pageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE);
printAttributeNames(ee, out, PageContext.REQUEST);


out.print("Hello from implicit object 'out'<br/>");
%>

<%= "Locale.displayCountry = " + response.getLocale().getDisplayCountry() + "<br/>" %>
<%= "InitParameter email = " + config.getInitParameter("email") + "<br/>" %>
<%= pageContext.findAttribute("applicationAttr") + "<br />" %>
<%= pageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE) + "<br />" %>






<br/>
${requestScope.requestAttr} <br/>
${responseScope.locale.displayCountry}  <br/>
${responseScope.locale}  <br/>
${responseScope}  <br/>
${response}  <br/>

${sessionScope.sessionAttr} <br/> 
${sessionScope['sessionAttr']} <br/>

${pageScope.pageContextAttr} <br/>
${pageScope['pageContextAttr']} <br/>

${applicationScope.applicationAttr} <br/>
${configScope.email} <br/>

${pageContext} <br/>
${pageContext.out} <br/>
${pageContext.request} <br/>
${pageContext.response} <br/>
${pageContext.session} <br/>
${pageContext.servletContext} <br/>
${pageContext.servletConfig} <br/>
${pageContext.out} <br/>
${pageContext.page} <br/>
  <br/>
   <br/>
</body>
</html>