package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Hans extends Person {
	
	public  String getFirstName(){ return "Hans";};
	
	public  List<String> getHobbies(){
		 List<String> hobbies =new ArrayList<>();
		 hobbies.add("sneak");
		 hobbies.add("nerden");
		 hobbies.add("theater");
		 hobbies.add("roeien");
		 
		return hobbies;}

}
