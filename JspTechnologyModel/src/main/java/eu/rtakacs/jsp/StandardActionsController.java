package eu.rtakacs.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import eu.rtakacs.jsp.domain.Pet;
import eu.rtakacs.jsp.domain.PetType;


@Controller
public class StandardActionsController extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(StandardActionsController.class);
	private static final long serialVersionUID = 1L;
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		logger.info("Welcome to StandardActionsController!");
		
		Pet myPet = new Pet();
		myPet.setType(PetType.Dog);
		myPet.setName("Jerry");
		request.setAttribute("myPet", myPet );
		
		request.getRequestDispatcher("standardActions.jsp").forward(request, response);
	}

	
	

}
