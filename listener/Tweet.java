package oving5;

public class Tweet {
	
	private TwitterAccount account;
	private String tweet;
	private Tweet reTweet;
	
	
	public Tweet(TwitterAccount account, String tweet){
		this.account = account;
		this.tweet = tweet;
	}
	
	public Tweet(TwitterAccount account, Tweet reTweet){
		this.account = account;
		this.reTweet = reTweet;
		
	}
	
	public String getText(){
		return this.tweet;
	}
	
	public TwitterAccount getOwner(){
		return this.account;
	}
	
	
//	public Tweet getOriginalTweet(){
//		if(this.tweet =)
//	}

}
