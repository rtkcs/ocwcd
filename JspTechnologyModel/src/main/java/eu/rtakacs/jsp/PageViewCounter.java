package eu.rtakacs.jsp;

public class PageViewCounter {

	private static int count;
	public static int getCount(){
		count++;
		return count;
	}
	
}
