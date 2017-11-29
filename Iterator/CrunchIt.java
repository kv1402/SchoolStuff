package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrunchIt implements Iterator<String>{

	public static void main(String[] args){
		
		List<String> cList = new ArrayList<String>();
		
		cList.add("eBay");
		cList.add("Paypal");
		cList.add("Google");
		cList.add("Yahoo");
		
		Iterator<String> list = cList.iterator();
		
		while(list.hasNext()){
			System.out.println(list.next());
			
			
		}
	}

	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}
}
