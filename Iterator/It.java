package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class It implements Iterable<String> {
	
	List<String> list = new ArrayList<String>();

	@Override
	public Iterator iterator() {
		return list.iterator();
	}

}
