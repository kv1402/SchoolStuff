package Iterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyIterable implements Iterable<String> {
	
	private List<String> list;
	
	public MyIterable(String [] t){
		list = Arrays.asList(t);
		Collections.reverse(list);
	}

	@Override
	public Iterator<String> iterator() {
		return list.iterator();
	}

}
