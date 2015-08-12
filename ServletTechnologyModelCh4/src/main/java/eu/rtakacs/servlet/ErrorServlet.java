package eu.rtakacs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(!req.getParameterMap().containsKey("error")){
			resp.getWriter().println("No Error");
			return;
		}
		
		if(req.getParameter("error").equals("403")){
			resp.sendError(HttpServletResponse.SC_FORBIDDEN);//403
		} else if(req.getParameter("error").equals("404")){
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);//404
		} else if(req.getParameter("error").equals("406")){
			resp.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Custom message");//406
		}
		else{
			resp.sendError(500);//Internal Server Error
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
