package eu.rtakacs.servlet;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LifecycleControllerSpring implements InitializingBean, DisposableBean {
	
	//TODO: doplnit do SpringServeltu HomeController metody init, destroy, doPost, doGet, doHead, getLast, doPut, doTrace...
	
	private static final Logger logger = LoggerFactory.getLogger(LifecycleControllerSpring.class);
	

	/*
	 * Spring way to initialize the bean
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("bean initialized >");
		
		logger.debug("bean initialized <");
	}
	
	/*
	 * Spring way to destroy the bean
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		logger.debug("bean destroyed >");
		
		logger.debug("bean destryed <");
	}



	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/lifecycleSpring", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/licecycleSpring", method = RequestMethod.POST)
	public String doPost(Locale locale, Model model){
		
		return this.home(locale, model);
	}
	
	@RequestMapping(value = "/licecycleSpring", method = RequestMethod.HEAD)
	public String doPost2(Locale locale, Model model){
		
		return this.home(locale, model);
	}
	
}
