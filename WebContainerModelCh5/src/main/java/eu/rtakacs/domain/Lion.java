package eu.rtakacs.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.rtakacs.servlet.InitParamControllerSpring;

public class Lion {
	
	private static final Logger logger = LoggerFactory.getLogger(Lion.class);
	
	private String breed;
	public Lion(String breed ){
		this.breed = breed;
		logger.debug("Lion creaded, breed="+this.breed);
	}
	
	void sleep(){
		logger.debug("Lion sleeping");
	}
	
	void hunt(){
		logger.debug("Lion hunting");
	}
	
	public String getBreed(){
		return this.breed;
	}

	@Override
	public String toString() {
		return "Lion [breed=" + breed + "]";
	}
	
	

}
