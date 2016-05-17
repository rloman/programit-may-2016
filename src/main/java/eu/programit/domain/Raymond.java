package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Raymond extends Person {

	@Override
	public String getFirstName() {
		return "Raymond";
	}

	@Override
	public List<String> getHobbies() {
		
		List<String> result = new ArrayList<>();
		result.add("running");
		///
		
		return result;	
	
	}

}
