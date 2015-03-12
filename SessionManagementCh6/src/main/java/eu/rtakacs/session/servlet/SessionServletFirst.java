package eu.rtakacs.session.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServeltFirst
 */
public class SessionServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String invalidateSession = "invalidateSession";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServletFirst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if("true".equalsIgnoreCase(request.getParameter(SessionServletFirst.invalidateSession))){
			request.getSession().invalidate();
		}
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h2>SessionServletFirst</h2><br>");
		
		//HttpSession session = null;//request.getSession();
		HttpSession session = request.getSession();
		
		if(session==null || session.isNew()){
			writer.print("Hello Stranger.<br>");
		
		} else{
			
			writer.print("Welcome back.<br>");
			writer.print("Creation time: " + Long.toString(session.getCreationTime())+ " _______ " + DateFormat.getDateTimeInstance().format(new Date(session.getCreationTime())));
			writer.print("<br>");
			writer.print("Last Accessed Time: " + Long.toString(session.getLastAccessedTime()) + " _______ " + DateFormat.getDateTimeInstance().format(new Date(session.getLastAccessedTime())));
			writer.print("<br>");
			writer.print("Max Inactive Interval: " + Integer.toString(session.getMaxInactiveInterval()) + " _______ " + session.getMaxInactiveInterval()/60 + " min.");
			writer.print("<br>");
		}
		
		// encodes the JSESSIONID in the URL if the JSESSIONID cookie fails
		// SessionServletFirst;jsessionid=9704CF472947F6D642D065A5EB8F878D
		writer.print("<br>");
		writer.print("<a href=\""+response.encodeURL("SessionServletFirst")+"\">SessionServletFirst</a>");
		writer.print("<br>");
		// encodeRedirectURL
		writer.print("<a href=\""+response.encodeRedirectURL("SessionServletFirst")+"\">SessionServletFirst redirect URL</a>");
		writer.print("<br>");
		writer.print("<a href=\""+response.encodeRedirectURL("spring")+"\">SessionServletSpring redirect URL</a>");
		writer.print("<br>");
		writer.print("<br>");
		writer.print("<a href=\""+response.encodeURL("SessionServletFirst?"+SessionServletFirst.invalidateSession+"=true") +"\">Invalidate Session</a>");
		
		request.getSession().setAttribute("sessionAttribute", "New Session String Attribute");
		request.getSession().removeAttribute("sessionAttribute");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
