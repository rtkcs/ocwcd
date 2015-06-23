package eu.rtakacs.jsp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.rtakacs.jsp.domain.Person;
import eu.rtakacs.jsp.domain.Pet;
import eu.rtakacs.jsp.domain.PetType;

public class ELController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Pet pet = new Pet();
		pet.setName("Tom");
		pet.setType(PetType.Cat);
		
		Person person = new Person();
		person.setName("Evan");
		person.setPet(pet);
		request.setAttribute("person", person);
		
		
		String[] myPets = {"Tom Cat", "Jerry Mouse", "100 dalmatines"};
		request.setAttribute("myPets", myPets);
		
		Map<String,String> mindMap = new HashMap<String,String>();
		mindMap.put("work", "Galvani Street");
		mindMap.put("home", "Bratislava");
		mindMap.put("hobby", "programming");
		request.setAttribute("mindMap", mindMap);
		request.setAttribute("hobby", "hobby");
		
		String[] mindMapKeys = {"work", "home", "hobby"};
		request.setAttribute("mindMapKeys", mindMapKeys);
		
		
		request.getRequestDispatcher("EL/ELBasics1.jsp").forward(request, response);
	}

}
