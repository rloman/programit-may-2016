package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Rik extends Person{

	@Override
	public String getFirstName() {
		return "Rik";
	}

	@Override
	public List<String> getHobbies() {
		List<String> result = new ArrayList<>(2);
        result.add("Rome");
        result.add("Italië");
        return result;
	}

}
