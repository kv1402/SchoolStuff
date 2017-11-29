package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TesTSort3 {
	
	public static void main(String args[]){  
//		ArrayList<Student> al = new ArrayList<Student>();  
//		al.add(new Student(101,"Vijay",23));  
//		al.add(new Student(106,"Ajay",27));  
//		al.add(new Student(105,"Jai",21));  
//		  
//		Collections.sort(al);  
//		
//		for(Student st: al){  
//		System.out.println(st.rollno + " " + st.name + " " +st.age);  
//		}  
		
		ArrayList<Persons> pers = new ArrayList<Persons>();
		
		pers.add(new Persons("Kari", 2));
		pers.add(new Persons("Åse", 1));
		pers.add(new Persons("Olav", 4));
		pers.add(new Persons("Heidi", 1));
		
		Collections.sort(pers);
		
		for(Persons st: pers){
			System.out.println("Name: " + st.getName() + " Age: " + st.getAge());
			
		}
	}  

}
