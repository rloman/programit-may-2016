package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Matthijs extends Person {

		@Override
		public String getFirstName() {
			return "Matthijs";
		}

		@Override
		public List<String> getHobbies() {
			
			List<String> result = new ArrayList<>();
			result.add("verzamelen");
			result.add("animé , films en TV-series kijken");
			result.add("gamen");
			///
			
			return result;	
		
		}

	}