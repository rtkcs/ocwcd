package eu.rtakacs.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstServletContextAttributeListener implements ServletContextAttributeListener {

	private static final Logger logger = LoggerFactory.getLogger(FirstServletContextAttributeListener.class);
	
	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		logger.debug( "attributeAdded: " + this.getAttribs(scab));

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		logger.debug("attributeRemoved:" + this.getAttribs(scab));
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		logger.debug("attributeReplaced:" + this.getAttribs(scab));
	}

	
	private String getAttribs(ServletContextAttributeEvent scae){
		String s = "ServletContextAttributeEvent[toString()="+scae.toString();
		s+= ", name=" + scae.getName();
		s+= " ,source=" + scae.getSource();
		s+= " ,value=" + scae.getValue();
		s+= "]";
		return s;
	}

}
