package eu.rtakacs.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.rtakacs.domain.Gecko;

/**
 * Servlet implementation class SynchronizedAccessToAttributesServlet
 */
public class SynchronizedAccessToAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SynchronizedAccessToAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = this.getServletContext();
		synchronized(context){
			Gecko gecko = (Gecko)context.getAttribute("gecko");
			String geckoSpecie = (String)context.getAttribute("geckoSpecie");
			geckoSpecie = "anothetGeskoSpecie";
			context.setAttribute("geckoSpecie", geckoSpecie);
		}
		
		HttpSession session = request.getSession();
		synchronized(session){
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
