package eu.rtakacs.session.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionActivationListener implements HttpSessionActivationListener {

	private static final Logger logger = LoggerFactory.getLogger(SessionActivationListener.class);
	
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		//prepare session attributes for migration
		logger.debug("sessionWillPassivate, Id="+se.getSession().getId());

	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		//prepare session attributes ready for using
		logger.debug("sessionDidActivate, Id="+se.getSession().getId());

	}

}
