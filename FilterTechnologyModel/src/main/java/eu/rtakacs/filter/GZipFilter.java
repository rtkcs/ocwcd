package eu.rtakacs.filter;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GZipFilter implements Filter {
	
	private ServletContext context;
	private FilterConfig	config;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.config = filterConfig;
		this.context = this.config.getServletContext();
		this.context.log(config.getFilterName() + " initialized");
				
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response; 
		
		String encodings = httpRequest.getHeader("Accept-Encoding");
		if(encodings.indexOf("gzip") > -1) {
			
			CompressionResponseWrapper wrappedResponse = new CompressionResponseWrapper(httpResponse);
			wrappedResponse.setHeader("Content-Encoding", "gzip");
			
			chain.doFilter(httpRequest, wrappedResponse);
			GZIPOutputStream gzipStream = wrappedResponse.getGZIPOutputStream();
			context.log(config.getFilterName() + ": finished the request");
			
		} else {
			context.log(config.getFilterName() + ": no encoding performed");
			chain.doFilter(httpRequest, httpResponse);
		}
		
		ServletResponseWrapper wrappedResponse = new ServletResponseWrapper(response);
		chain.doFilter(request, wrappedResponse);

	}

	@Override
	public void destroy() {
		
		this.config = null;
		this.context = null;

	}

}


