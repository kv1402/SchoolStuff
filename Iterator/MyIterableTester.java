package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Delegering.C;
import Delegering.Scretary;

public class MyIterableTester implements Iterator<String>{
	
	Collection<String> list = new ArrayList<>();
	
	
	Iterator it = list.iterator();

	public static void main(String[] argss){
		
		Collection<String> list = new ArrayList<>();
		
		
//	C c = new C();
//	c.f(); // outpput: A 
//	c.g(); // A
//	
//	c.toB();
//	c.f();
//	c.g();
//	
//	Scretary kiwi = new Scretary();
//	
//	kiwi.work();
		
		char [] hest = {'o', 'p'};
		
		
		
		System.out.println(hest);
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
