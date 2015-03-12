package eu.rtakacs.session.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionListener implements javax.servlet.http.HttpSessionListener {
	
	
	private static final Logger logger = LoggerFactory.getLogger(SessionListener.class);
	
	/** 
	* Notification that a session was created.
	* @param se the notification event
	*/
    public void sessionCreated ( HttpSessionEvent se ){
    	HttpSession session = se.getSession();
    	logger.debug("sessionCreated Id="+session.getId());
    }
    
	/** 
	* Notification that a session is about to be invalidated.
	* @param se the notification event
	*/
    public void sessionDestroyed ( HttpSessionEvent se ){
    	HttpSession session = se.getSession();
    	logger.debug("sessionDestroyed Id="+session.getId());
    }
    
	

}
