package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LoopStyles {


	public static void main(String[] args){
		
		List<String> flavours = new ArrayList<String>();
		flavours.add("chocolate");
		flavours.add("Strawberry");
		flavours.add("Vanilla");
		
		useWhileLoop(flavours);
		useForLoop(flavours);

			
		}
	
	public static void useWhileLoop(List<String> flavours){
		Iterator<String> flavoursIter = flavours.iterator();
		while (flavoursIter.hasNext()){
			System.out.println(" While Loop: " + flavoursIter.next());
		}
	}
	
	public static void useForLoop(Collection<String> flavours){
		for(Iterator<String> flavoursIter = flavours.iterator(); flavoursIter.hasNext();){
			System.out.println(" For loop: " + flavoursIter.next());
			
		}
		
	}

}
