package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Henri extends Person {
    /*
     * Some people might not agree for Henri
     * to extend the Person class :)
     */

	@Override
	public String getFirstName() {
		return "Henri";
	}

	@Override
	public List<String> getHobbies() {
		
		List<String> result = new ArrayList<>();
		result.add("IT");

		///
		
		return result;	
	
	}

}
