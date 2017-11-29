package oving5;

import java.util.Comparator;

public class TweetsCountComparator implements Comparator<TwitterAccount> {
	
	
	@Override
	public int compare(TwitterAccount o1, TwitterAccount o2) {
	int totTweet = o1.getTweetCount();
	int totTweet2 = o2.getTweetCount();
		return totTweet - totTweet2;
	}

}
