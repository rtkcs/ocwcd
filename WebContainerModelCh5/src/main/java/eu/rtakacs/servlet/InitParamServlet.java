package eu.rtakacs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.rtakacs.domain.Gecko;
import eu.rtakacs.domain.Lion;

public class InitParamServlet extends HttpServlet {

	private static final Logger logger = LoggerFactory.getLogger(InitParamServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.debug("doGet >");
		this.doPost(req, resp);
		logger.debug("doGet <");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.debug("doPost >");
		
		
		PrintWriter writer = resp.getWriter();
		
		String contactEmail = getServletConfig().getInitParameter("contactEmail");
		String infoEmail = getServletConfig().getInitParameter("infoEmail");
		writer.println("contact email: " + contactEmail + "<br>");
		writer.println("info email: " + infoEmail + "<br>");
		
		String salesEmail = getServletContext().getInitParameter("salesEmail");
		writer.println("sales email: " + salesEmail + "<br>");
		
		Lion lion = (Lion)getServletContext().getAttribute("lion");
		writer.println("In the ServletContect we have also a " + lion.toString());
		
		Gecko gecko = (Gecko)getServletContext().getAttribute("gecko");
		req.getSession().setAttribute("gecko", gecko);
		req.getSession().removeAttribute("gecko");
		
		
		logger.debug("doPost <");
	}

}
