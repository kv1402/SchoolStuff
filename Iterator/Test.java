package Iterator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test implements Iterator {
	
		List<String> list = new ArrayList<String>();
		public static int start = 0;
		
		public Test(List<String> list){
			this.list = list;
		}

	@Override
	public boolean hasNext() {
		if(list.get(start+1).equals(null)){
			return false;
		} else{
			return true;
		}
	}

	@Override
	public String next() {
		if(this.hasNext()){
			start = start +1;
			return this.list.get(start);
		}else {
			throw new IllegalArgumentException("Do not have any next! Shame on u....");
		}
	}
	
	public static void main(String[] args){
		
		List<String> list = new ArrayList<String>();
		
		Test tester = new Test(list);
		
		list.add("String");
		list.add("Test");
		list.add("HAloTO");
		
		System.out.println(tester.hasNext());
		System.out.println(tester.next());
		System.out.println(tester.next());
		System.out.println(tester.next());
		
	}

}

