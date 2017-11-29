package oving5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TwitterAccount {
	private String twitterAccount;
	private ArrayList<TwitterAccount> follow = new ArrayList<TwitterAccount>(); // liste over de den følger.
	private List<TwitterAccount> followers; // liste over følgerne
	
	private String tweet;
	private int amountRetweet = 0;
	
	private Stack<Tweet> tweetList = new Stack<Tweet>();
	
	public TwitterAccount(String twitterAccount){
		this.twitterAccount = twitterAccount;
		follow = new ArrayList<TwitterAccount>();
	}
	
	public String getUsername(){
		return this.twitterAccount;
	}
	
	//denne brukeren legger til de den følger i denne lista
	public void follow(TwitterAccount twitterAccount){ 
		if(!isFollowing(twitterAccount)){
			this.follow.add(twitterAccount);
			twitterAccount.followers.add(this);	
		}
	}
	
	public void unfollow(TwitterAccount twitterAccount){
		if(isFollowing(twitterAccount)){
			this.follow.remove(this.follow.indexOf(twitterAccount));
			twitterAccount.followers.remove(twitterAccount.followers.indexOf(this));
		}
	}
	
	public boolean isFollowing(TwitterAccount twitterAccount){
		boolean following = true;
		if(!follow.contains(twitterAccount)){
			following = false;
		}
		return following;
	}

	
	public boolean isFollowedBy(TwitterAccount twitterAccount){
		return twitterAccount.isFollowing(this);
	}
	
	public void tweet(String tweet){
		Tweet newTweet = new Tweet(this, tweet);
		tweetList.push(newTweet);
	}

	
	public String getMessage(Tweet tweet){
		return tweet.getText();
	}
	
		public Tweet getTweet(int i){
		return tweetList.get(i);
	}
		
	//bør holde antal ganger denne blir retweeta??
public void retweet(Tweet tweet){
	Iterator<Tweet> iter = tweetList.iterator();
		while(iter.hasNext()){
			if(iter.next().equals(tweet)){
				getMessage(tweet);
				this.amountRetweet += amountRetweet;
			}
			
		}
		//retweeter tweet fra denne kontoen
}
	

	public int getTweetCount(){
		return tweetList.size();
	}
		
	
	public ArrayList<String> getFollowing(){
		ArrayList<String> followAccount= new ArrayList<String>();
		for(Iterator<TwitterAccount> i = follow.iterator(); i.hasNext();){
			String item = i.next().getUsername();
			followAccount.add(item);
		}
		return followAccount;
	}

	
	public ArrayList<String> getFollowers(){
		ArrayList<String> followersAccount= new ArrayList<String>();
		for(Iterator<TwitterAccount> i = followers.iterator(); i.hasNext();){
			String item = i.next().getUsername();
			followersAccount.add(item);
		}
		return followersAccount;
	}
	
	
	public int getRetweetCount(){
		return this.amountRetweet;
	}

}
