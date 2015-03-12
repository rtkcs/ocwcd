package eu.rtakacs.domain;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.rtakacs.servlet.listener.FirstServletContextListener;

public class Gecko implements HttpSessionBindingListener {
	
	
	private static final Logger logger = LoggerFactory.getLogger(Gecko.class);
	
	private String specie;
	
	public Gecko(String specie){
		this.specie = specie;
		logger.debug("Gecko created :" + this.toString());
	}
	
	public String getSpecie(){
		return this.specie;
	}
		
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		logger.debug(this.toString() + " to the session bound.");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		logger.debug(this.toString() + " from the session unbound.");
	}

	@Override
	public String toString() {
		return "Gecko [specie=" + specie + "]";
	}
	
	

}
