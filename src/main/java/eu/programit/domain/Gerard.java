package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Gerard extends Person {
  Gerard(){ System.out.println("Gerard.");}
  
  
	public String getFirstName(){
	 return "Gerard";}
	
	public List<String> getHobbies(){
		List<String> hobbyGerard = new ArrayList<>(2);
        hobbyGerard.add("Golfen");
        hobbyGerard.add("Klootschieten");
        hobbyGerard.add("RC Racen onroad");
        
		return hobbyGerard;
	}
}
