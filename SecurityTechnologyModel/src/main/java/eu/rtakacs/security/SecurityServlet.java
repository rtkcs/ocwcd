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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("SecurityServlet.doGet");
		this.printUser(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("SecurityServlet.doPost");
		this.printUser(request, response);

	}
	
	private void printUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if(request.getUserPrincipal() != null) {
			response.getWriter().println("userPrincipal.name = " + request.getUserPrincipal().getName());
			response.getWriter().println("isUserInRole(\"Manager\") = " + request.isUserInRole("manager"));
			response.getWriter().println("remoteUser = " + request.getRemoteUser());			
		} else {
			response.getWriter().println("Not logged in, anonymouse access");
		}
		
	}

}
