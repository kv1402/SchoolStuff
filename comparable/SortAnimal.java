package Comparable;

import java.util.Arrays;

public class SortAnimal {
	
	public static void main(String args[]){

		Animal[] fruits = new Animal[4];

		Animal hest = new Animal("Hest", 2017, "200000" );
		Animal ape = new Animal("Ape", 2016,"1009");
		Animal okse = new Animal("Okse", 2001,"800");
		Animal bamse = new Animal("Bamse",1991,"900");

		fruits[0]=hest;
		fruits[1]=ape;
		fruits[2]=okse;
		fruits[3]=bamse;

		Arrays.sort(fruits);

		int i=0;
		for(Animal temp: fruits){
		   System.out.println("Animal " + ++i + " : " + temp.toString());
		}

	}

}
