package eu.rtakacs.session.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionAttribute implements HttpSessionBindingListener {
	
	private static final Logger logger = LoggerFactory.getLogger(SessionAttribute.class);

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		logger.debug("valueBound, Name=" + event.getName());

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		logger.debug("valueUnbound, Name=" + event.getName());

	}
	/*
	@Override
	public String toString(){
		return "Class:SessionAttribute";
		
	}*/
}
