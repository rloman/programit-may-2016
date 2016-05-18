package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Ben extends Person {
	public static void main (String [] args) {
		System.out.println("test Ben");
	}
	public Ben() {
        List<String> a = new ArrayList<>();
        a.add("Lopen");
        a.add("Fietsen");
	}
	@Override
	public String getFirstName() {
	return "Ben";	
	}
	@Override
	public List<String> getHobbies() {
        List<String> b = new ArrayList<>();
        b.add("Lopen");
        b.add("Fietsen");
		return b;
	}
}