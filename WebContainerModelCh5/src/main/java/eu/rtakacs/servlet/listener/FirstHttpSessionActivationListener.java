package eu.rtakacs.servlet.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstHttpSessionActivationListener implements HttpSessionActivationListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstHttpSessionActivationListener.class);
	
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		logger.debug("sessionWillPassivate: " + this.getAttributes(se));
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		logger.debug("sessionDidActivate: " + this.getAttributes(se));
	}
	
	private String getAttributes(HttpSessionEvent se){
		String s = "HttpSessionEvent[toString()="+se.toString();
		s+= " ,session=" + se.getSession();
		s+= " ,source=" + se.getSource();
		s+= "]";
		return s;
	}
}
