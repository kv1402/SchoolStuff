package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args){


			Fruit1[] fruits = new Fruit1[4];

			Fruit1 pineappale = new Fruit1("Pineapple", "Pineapple description",7);
			Fruit1 apple = new Fruit1("Apple", "Apple description",10);
			Fruit1 orange = new Fruit1("Orange", "Orange description",180);
			Fruit1 banana = new Fruit1("Banana", "Banana description",90);

			fruits[0]=pineappale;
			fruits[1]=apple;
			fruits[2]=orange;
			fruits[3]=banana;

			Arrays.sort(fruits);

			int i=0;
			for(Fruit1 temp: fruits){
			   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
				", Quantity : " + temp.getQuantity());
			}

	}

}
