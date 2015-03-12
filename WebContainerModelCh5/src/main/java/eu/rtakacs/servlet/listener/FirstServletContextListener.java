package eu.rtakacs.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.rtakacs.domain.Gecko;
import eu.rtakacs.domain.Lion;

public class FirstServletContextListener implements ServletContextListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstServletContextListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.debug("contextInitialized >");
		
		
		ServletContext ctx = sce.getServletContext();
		String lionBreed = ctx.getInitParameter("lionBreed");
		
		Lion lion = new Lion(lionBreed);
		ctx.setAttribute("lion", lion);
		logger.debug("Lion created and to the ServletContext as an Attribute added. " + lion.toString());
		
		String geckoSpecie = ctx.getInitParameter("geckoSpecie");
		Gecko gecko = new Gecko(geckoSpecie);
		ctx.setAttribute("gecko", gecko);
		logger.debug("Gecko created and to the ServletContext as an Attribute added. " + gecko.toString());
		
		logger.debug("contextInitialized <");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.debug("contextDestroyed >");
		
		logger.debug("contextDestroyed <");
	}

}