package eu.rtakacs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiverServlet extends HttpServlet {

	private static final Logger logger = LoggerFactory.getLogger(ReceiverServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("FORWARD_CONTEXT_PATH ("+RequestDispatcher.FORWARD_CONTEXT_PATH+") = \"" + request.getAttribute(RequestDispatcher.FORWARD_CONTEXT_PATH)+"\"<br>");
		pw.print("FORWARD_PATH_INFO ("+RequestDispatcher.FORWARD_PATH_INFO+") = \"" + request.getAttribute(RequestDispatcher.FORWARD_PATH_INFO)+"\"<br>");
		pw.print("FORWARD_REQUEST_URI ("+RequestDispatcher.FORWARD_REQUEST_URI+") = \"" + request.getAttribute(RequestDispatcher.FORWARD_REQUEST_URI)+"\"<br>");
		pw.print("FORWARD_SERVLET_PATH ("+RequestDispatcher.FORWARD_SERVLET_PATH+") = \"" + request.getAttribute(RequestDispatcher.FORWARD_SERVLET_PATH)+"\"<br>");
		pw.print("FORWARD_QUERY_STRING ("+RequestDispatcher.FORWARD_QUERY_STRING+") = \"" + request.getAttribute(RequestDispatcher.FORWARD_QUERY_STRING)+"\"<br>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
