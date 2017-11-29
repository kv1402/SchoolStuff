package Comparable;

import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

	 private int id;
	    private String name;
	    private int age;

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.getId() - arg0.getId();
	}
	 public Employee(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }
	 public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age  + "]";
	    }
	 


}
