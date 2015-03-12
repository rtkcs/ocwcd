package eu.rtakacs.session.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionAttributeListener implements HttpSessionAttributeListener {
	
	private static final Logger logger = LoggerFactory.getLogger(SessionAttributeListener.class);
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		logger.debug("atributeAdded, Name="+se.getName() + ", Value="+se.getValue().toString());

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		logger.debug("attributeRemoved, Name="+se.getName() + ", Value="+se.getValue());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		logger.debug("atributeReplaced, Name="+se.getName() + ", oldValue="+se.getValue().toString() + ", newValue="+se.getSession().getAttribute(se.getName()).toString());

	}

}
