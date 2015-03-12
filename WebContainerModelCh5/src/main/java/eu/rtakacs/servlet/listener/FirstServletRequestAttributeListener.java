package eu.rtakacs.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstServletRequestAttributeListener implements ServletRequestAttributeListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstServletRequestAttributeListener.class);
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		logger.debug("attributeAdded: " + this.getAttributes(srae));

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		logger.debug("attributeRemoved: " + this.getAttributes(srae));

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		logger.debug("attributeReplaced: " + this.getAttributes(srae));

	}
	
	private String getAttributes(ServletRequestAttributeEvent srae){
		String s = "ServletRequestAttributeEvent[toString()=" + srae.toString();
		s+= " ,name=" + srae.getName();
		s+= " ,value=" + srae.getValue();
		s+= " ,source=" + srae.getSource();
		s+= "]";
		return s;
		
	}

}
