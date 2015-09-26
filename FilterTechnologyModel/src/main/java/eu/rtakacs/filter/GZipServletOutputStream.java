package eu.rtakacs.filter;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;

public class GZipServletOutputStream extends ServletOutputStream {
	
	
	GZIPOutputStream stream = null;
	
	public GZipServletOutputStream(ServletOutputStream sos) throws IOException{
		
		this.stream = new GZIPOutputStream(sos);
	}
	
	@Override
	public void write(int b) throws IOException {
		stream.write(b);

	}

}
