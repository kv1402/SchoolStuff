package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student1> students=new ArrayList<Student1>();  
		students.add(new Student1(101,"hege",23));
		students.add(new Student1(102,"per",22));
		students.add(new Student1(103,"aksel",24));
		students.add(new Student1(104,"hanne",21));
		
		Collections.sort(students);
		
		int i = 1;
		for(Student1 st : students){
			System.out.println("Stundet nr: " + i++ + "This is roll: " + st.rollno + " name: " + st.name + " age " + st.age);
		}
		
	
//		
//		ArrayList<Student> al=new ArrayList<Student>();  
//		al.add(new Student(101,"Vijay",23));  
//		al.add(new Student(106,"Ajay",27));  
//		al.add(new Student(105,"Jai",21));  
//		  
//		Collections.sort(al);  
//		for(Student st:al){  
//		System.out.println(st.rollno+" "+st.name+" "+st.age);  
//		} 
//		

	}

}
