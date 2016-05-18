package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Remond extends Person {

	@Override
	public String getFirstName() {
		return "Remond";
	}

	@Override
	public List<String> getHobbies() {
		
		List<String> result = new ArrayList<>();
		result.add("Cooking");
		result.add("Traveling Far");
		///
		
		return result;	
	
	}

}