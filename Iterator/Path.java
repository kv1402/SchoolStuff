package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Path implements Iterable<String> {
	private static List<String> segments;
	@Override
	public Iterator<String> iterator() {
		return segments.iterator();
	}
	
	public static void main (String[] args){
		
	}



}
