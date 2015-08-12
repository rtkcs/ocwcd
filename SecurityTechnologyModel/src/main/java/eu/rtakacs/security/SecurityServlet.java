package eu.rtakacs.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7157177701183344429L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("SecurityServlet.doGet");
		//super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("SecurityServlet.doPost");
		//super.doPost(req, resp);
	}

}
