package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Rémond extends Person {

	@Override
	public String getFirstName() {
		return "Rémond";
	}

	@Override
	public List<String> getHobbies() {
		
		List<String> result = new ArrayList<>();
		result.add("Cooking");
		///
		
		return result;	
	
	}

}
