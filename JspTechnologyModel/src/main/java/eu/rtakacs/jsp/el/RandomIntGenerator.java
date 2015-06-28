package eu.rtakacs.jsp.el;

public class RandomIntGenerator {
	
	public static int getInt(){
		
		int i = (int) (Math.random()*1000);
		return i;
	}
	
	public static int getInt(int maxInteger){
		int i = (int)(Math.random()*maxInteger)+1;
		return i;
	}

}
