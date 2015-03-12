package eu.rtakacs.servlet;

import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

import eu.rtakacs.domain.Lion;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InitParamControllerSpring implements ServletConfigAware, ServletContextAware{
	
	private static final Logger logger = LoggerFactory.getLogger(InitParamControllerSpring.class);

	private ServletConfig cfg = null;
	private ServletContext ctx = null;
	
	@Override
	public void setServletConfig(ServletConfig arg0) {
		cfg = arg0;
	}
	
	

	
	@Override
	public void setServletContext(ServletContext arg0) {
		ctx = arg0;
	}




	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/initParamSpring", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		model.addAttribute("email", cfg.getInitParameter("email"));
		
		Enumeration<String> en = cfg.getInitParameterNames();
		String names = "";
		while(en.hasMoreElements()){
			names = en.nextElement() + ", ";
		}
		names = names.substring(0, names.length()-2);
		model.addAttribute("initParameterNames", names);
		
		String salesEmail = ctx.getInitParameter("salesEmail");
		model.addAttribute("salesEmail", salesEmail);
		
		Lion lion = (Lion)ctx.getAttribute("lion");
		model.addAttribute("lion", lion);
		

		
		return "home";
	}




	
}
