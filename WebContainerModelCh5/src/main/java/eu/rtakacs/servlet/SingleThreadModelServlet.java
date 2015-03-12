package eu.rtakacs.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class SingleThreadModelServlet
 */

public class SingleThreadModelServlet extends HttpServlet implements SingleThreadModel {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(SingleThreadModelServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleThreadModelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("doGet");
		response.setContentType("text/html");


		response.getWriter().print(getDate());
		
		for(long i=0;i<9000000L;i++){
			if(i%500==0)
				response.getWriter().print("i="+i+"<br>");
		}
		response.getWriter().println("loop ended");
		response.getWriter().print(getDate());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	private String getDate(){

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

		String formattedDate = dateFormat.format(date);
		return formattedDate;
	}

}
