package eu.rtakacs.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifecycleServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5816857572909566962L;
	private static final Logger logger = LoggerFactory.getLogger(LifecycleServlet.class);
	
	
	@Override
	protected long getLastModified(HttpServletRequest req) {
		logger.debug("getLastModified >");
		long last = super.getLastModified(req);
		logger.debug("getLastModified lastModified = "+last+" <");
		return last;
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.debug("doGet >");
		//super.doGet(req, resp);
		
		
		if(req.getParameterMap().containsKey("id")){
			String fileName = null;
			String fileType = null;
			int i = Integer.parseInt(req.getParameter("id"));
			switch (i){
				case 1:
					fileName = "WEB-INF\\resources\\junit-4.8.2.jar";
					fileType = "application/jar";
					
					ServletOutputStream sos = resp.getOutputStream();
					
					
					InputStream is = getServletContext().getResourceAsStream(fileName);
					String realFilePath = getServletContext().getRealPath(fileName);
					
					File file = new File(realFilePath);
					
					resp.setContentType(fileType);
					resp.setContentLength((int)file.length());
					resp.setHeader("Content-Disposition", "attachment; filename="+file.getName());
					
					
					
					
					FileInputStream fis = new FileInputStream(file);
					byte[] b = new byte[1024];
					
					while(fis.read(b, 0, b.length) > 0){
						sos.write(b);
					}
					fis.close();
					sos.close();

					break;
				
				case 2:
					resp.sendRedirect("http://www.popsci.com");
					break;

				case 3:
					resp.sendRedirect("download.jsp");
					break;					

				case 4:
					resp.sendRedirect("/");
					break;
				case 5:
					RequestDispatcher rd1 = req.getRequestDispatcher("download.jsp");
					rd1.forward(req, resp);
					break;
				case 6:
					RequestDispatcher rd2 = req.getRequestDispatcher("");
					rd2.forward(req, resp);
					break;
				
				case 7:
					resp.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
					break;
					
					
				default:
					
					break;
			}


			
			
			
		} else{
			
			resp.setContentType("text/html");
			resp.getWriter().println("doGet called<br />");
			String userAgent = "User-Agent";
			resp.getWriter().println(userAgent + " : " + req.getHeader(userAgent)+"<br />");
			resp.getWriter().println("Method: " + req.getMethod()+"<br />");
			resp.getWriter().println("QueryString: " + req.getQueryString()+"<br />");
		}
		
		logger.debug("doGet <");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doHead(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.debug("doPost >");
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		
		// pokial pouzijem BufferedReader na vycitanie obsahu requestu
		// neviem nacitac RequestParametre
		/*
		 * 
		resp.getWriter().println("intput from BufferedReader:<br />");
		BufferedReader br = req.getReader();
		resp.getWriter().println(br.readLine()+"<br />");
		*/
		
		resp.getWriter().println("Method: " + req.getMethod()+"<br />");
		resp.getWriter().println("Name = "+req.getParameter("name")+"<br />");
		
		String[] colors = req.getParameterValues("color");
		resp.getWriter().println("Colors: <br />");
		if(colors != null){
			for(String color:colors){
				resp.getWriter().println(color+"<br />");
			}
		}
		
		resp.getWriter().println("QueryString: " + req.getQueryString()+"<br />");
		

		
		logger.debug("doPost <");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPut(req, resp);
		resp.setContentType("text/html");
		resp.getOutputStream().println("doPut called");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doDelete(req, resp);
		resp.setContentType("text/html");
		resp.getOutputStream().println("doDelete called");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doTrace(req, resp);
	}

	@Override
	public void destroy() {
		logger.debug("destroy >");
		super.destroy();
		logger.debug("destroy <");
	}

	@Override
	public void init() throws ServletException {
		logger.debug("init >");
		super.init();
		logger.debug("init <");
	}
	
	

}
