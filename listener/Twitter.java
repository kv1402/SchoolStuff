package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Twitter {
	
	public static void main(String[] args){
		
		TwitterAccount twitter[] = new TwitterAccount[5];
		
		
		twitter[0]= new TwitterAccount("Per");
		twitter[1]= new TwitterAccount("Kiwi");
		twitter[2] = new TwitterAccount("Hest");
		twitter[3] = new TwitterAccount("Inga");
		twitter[4]= new TwitterAccount("Pumba");
		
//		twitter[1].follow(twitter[0]);
//		twitter[1].follow(twitter[3]);
//		twitter[1].follow(twitter[2]);
//		twitter[0].follow(twitter[3]);
//		twitter[4].follow(twitter[3]);
//		twitter[0].follow(twitter[4]);
//		
//		System.out.println(kiwi.getFollowing());
//
//		kiwi.unfollow(per);
//		
//		System.out.println(kiwi.getFollowing());
//		System.out.println(inga.getFollowers());
//		System.out.println(per.getFollowers());
//		System.out.println(inga.isFollowedBy(kiwi));
//		
//		kiwi.tweet("Dette er så kuult");
//		System.out.println(kiwi.getMessage(kiwi.getTweet(0)));
//		System.out.println(kiwi.getTweetCount());
//		kiwi.tweet("Dette er Awesome");
//		kiwi.tweet("Dette er Kjempe Gøy");
//		kiwi.tweet("Dette er Klarer jeg LETT");
//		kiwi.tweet("Stå på!! :D ");
//		System.out.println(kiwi.getTweetCount());
//		
//		//System.out.println(kiwi.isFollowing(per));
//		
//		Stack<String> potet = new Stack<String>();
//		potet.add("halo");
//		potet.add("kake");
//		
//		Iterator<String> test = potet.iterator();
// 		
//		System.out.println(potet.iterator());
//		System.out.println(test.hasNext());
//		
//		System.out.println(test.next());
//		System.out.println(test.next());
//		System.out.println(test.next());
		
		System.out.println("Brukere uten sortering ");
		
		for(int i=0; i < twitter.length; i++){
			System.out.println(twitter[i].getUsername() + " Har " + twitter[i].getFollowers().size() + " followers"); 
			
		}
		
		
	}
		

}
