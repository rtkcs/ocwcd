package eu.rtakacs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//super.doGet(req, resp);
		resp.getWriter().print( req.getMethod() + " ");
		resp.getWriter().print(req.getRequestURL());
		//resp.getWriter().print("<br>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//super.doPost(req, resp);
		doGet(req,resp);
	}
	
	

}
