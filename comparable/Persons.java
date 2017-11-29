package Comparable;

public class Persons implements Comparable<Persons>{
	
	private String name;
	private int age;
	
	public Persons(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	@Override
	public int compareTo(Persons o) {
		return this.age - o.age;
	}



}
