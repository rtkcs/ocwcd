package eu.rtakacs.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstHttpSessionListener implements HttpSessionListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstHttpSessionListener.class);
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		logger.debug("sessionCreated: "+this.getAttributes(se));

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		logger.debug("sessionDestroyed: " + this.getAttributes(se));
	}
	
	private String getAttributes(HttpSessionEvent se){
		String s = "HttpSessionEvent[toString()="+se.toString();
		s+= " ,session=" + se.getSession();
		s+= " ,source=" + se.getSource();
		s+= "]";
		return s;
	}

}
