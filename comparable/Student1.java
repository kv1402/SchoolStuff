package Comparable;

public class Student1 implements Comparable<Student1>{
	
	int rollno;
	String name;
	int age;
	
	public Student1(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int compareTo(Student1 o) {
		if(this.age == o.age){
			return 0;
		}else if(this.age > o.age){
			return 1;
		}else {
			return -1;
		}
	}



}
