package eu.rtakacs.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.rtakacs.session.HomeController;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(CookieServlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("CookieServlet >");
		String name = "";

		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			if("username".equals(c.getName())){
				name = c.getValue();
				logger.info("Cookie found: " + c.getName() + " " + c.getValue());
				break;
			}
		}

		if("".equals(name) && request.getParameter("userName")!=null && request.getParameter("userName").length()>0){
			
			name = request.getParameter("userName");
			logger.info("userName= " + name);
			
			Cookie cookie = new Cookie("username", name);
			cookie.setComment("Name of the user");
			cookie.setMaxAge(30 * 60); // in seconds, 30 minutes
			response.addCookie(cookie);

		}
		
		request.setAttribute("name", name);		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/cookie.jsp");
		view.forward(request, response);
		logger.info("CookieServlet <");
	}

}
