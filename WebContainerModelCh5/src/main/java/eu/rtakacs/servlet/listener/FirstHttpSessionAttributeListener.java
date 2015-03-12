package eu.rtakacs.servlet.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstHttpSessionAttributeListener implements HttpSessionAttributeListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstHttpSessionAttributeListener.class);
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		logger.debug("attributeAdded: " + this.getAttributes(se));

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		logger.debug("attributeRemoved: " + this.getAttributes(se));

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		logger.debug("attributeReplaced: " + this.getAttributes(se));

	}
	
	private String getAttributes(HttpSessionBindingEvent se){
		String s = "HttpSessionBindingEvent[toString()=" + se.toString();
		s+=" ,name=" + se.getName();
		s+=" ,value=" + se.getValue();
		s+=" ,sourve=" + se.getSource();
		s+=" ,session=" + se.getSession();
		s+="]";
		return s;
	}

}
