package Observer;

import java.util.ArrayList;
import java.util.Collection;

public class Idol {
	
	private String hairColor;
	private String hairLenght;
	
	Collection<Fan> fans = new ArrayList<Fan>();
	
	public String hairColor(){
		return this.hairColor;
	}
	
	public String hairLength(){
		return this.hairLenght;
	}
	
	
	public String getHairColor(){
		return this.hairColor;
	}
	
	public String getHairLength(){
		return this.hairLenght;
	}
	
//	public void setHairLenght(String length){
//		this.hairLenght = length;
//		tellFans("hairLength");
//	}
//	
//	public void setHairColor(String hairColor){
//		this.hairColor = hairColor;
//		tellFans("hairColor");
//	}
	
	public void registerNewFan(Fan fan){
		this.fans.add(fan);
		
	}
	
	public void unregisterFan(Fan fan){
		this.fans.remove(fan);
		
	}
	
//	public void tellFans(String noeEndret){
//		for(Fan fan: fans){
//			fan.noeEndret(this, noeEndret);
//		}
//	}

}
