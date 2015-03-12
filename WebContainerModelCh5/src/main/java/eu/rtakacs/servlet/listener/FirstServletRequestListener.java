package eu.rtakacs.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstServletRequestListener implements ServletRequestListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstServletRequestListener.class);
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		logger.debug("requestDestroyed: " + this.getAttributes(sre));

	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		logger.debug("requestInitialized: " + this.getAttributes(sre));

	}
	
	private String getAttributes(ServletRequestEvent sre){
		String s = "ServletRequestEvent[toString()=" + sre.toString();
		s+= " ,source=" + sre.getSource();
		s+=" ,servlerRequest=" + sre.getServletRequest();
		s+=" ,servlerContext=" + sre.getServletContext();
		s+= "]";
		
		return s;
	}

}
