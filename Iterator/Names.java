package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Names  {
    static Collection<String> names = new ArrayList<String>();
    
    public static void main(String[] args) {
    	
    	names.add("Jim");
    	names.add("Jenn");
    	names.add("mary");
    	
    	
      // Names names = new Names();
        for (String name : names) {
            System.out.println(name);
        }
    }
    public Iterator<String> iterator() {
        return names.iterator();
    }

}