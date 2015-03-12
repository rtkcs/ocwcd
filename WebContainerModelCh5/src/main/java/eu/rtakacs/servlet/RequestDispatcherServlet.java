package eu.rtakacs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 808111002135779041L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameterMap().containsKey("action")){
		
			if(request.getParameter("action").equalsIgnoreCase("servletconfig")){
				request.setAttribute("gecko", getServletContext().getAttribute("gecko"));
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/requestDispatcherServelt.jsp");
				rd.forward(request, response);
				
			} else if(request.getParameter("action").equalsIgnoreCase("servletcontext")){

				//if the RequestDispatcher is obtained from servletContext, the path must start with a /
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/initParam");
				//RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/requestDispatcherServelt.jsp");
				rd.forward(request, response);
			} else if(request.getParameter("action").equalsIgnoreCase("receiverservlet")){

				//if the RequestDispatcher is obtained from servletContext, the path must start with a /
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/receiverServlet");
				//RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/requestDispatcherServelt.jsp");
				rd.forward(request, response);
			}

			
		}else{
			
		}
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}
	
	

}
