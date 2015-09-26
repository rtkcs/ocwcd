package eu.rtakacs.filter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CompressionResponseWrapper extends HttpServletResponseWrapper {
	
	private HttpServletResponse response = null;
	private GZipServletOutputStream gzipServletOS = null;
	private PrintWriter printWriter = null;
	
	public CompressionResponseWrapper(HttpServletResponse response){
		super(response);
		this.response = response;
	}
	
	public GZIPOutputStream getGZIPOutputStream() throws IOException{
		
		return this.gzipServletOS.stream;
	}
	
	public void setContentLength(int len) {}
	
	private Object streamUsed = null;
	
	public ServletOutputStream getOutputStream() throws IOException{
		
		if( (streamUsed != null) && (streamUsed != printWriter) ) {
			throw new IllegalStateException();
		}
		
		if(gzipServletOS == null) {
			gzipServletOS = new GZipServletOutputStream(getResponse().getOutputStream());
			streamUsed = gzipServletOS;
		}
		return gzipServletOS;
	}
	
	public PrintWriter getWriter() throws IOException{
		if( (streamUsed != null) && (streamUsed != printWriter) ) {
			throw new IllegalStateException();
		}
		
		if(printWriter == null) {
			
			gzipServletOS = new GZipServletOutputStream(getResponse().getOutputStream());
			OutputStreamWriter osw = new OutputStreamWriter(gzipServletOS, getResponse().getCharacterEncoding());
			printWriter = new PrintWriter(osw);
			streamUsed = printWriter;
		}
		return printWriter;
	}
}
