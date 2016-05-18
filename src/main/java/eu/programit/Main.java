package eu.programit;

import java.util.ArrayList;
import java.util.List;

import eu.programit.domain.Person;
import eu.programit.domain.Raymond;

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		// feature 1.  add your person class

		Person raymond = new Raymond();

		// feature 2. add your own Person here
		people.add(raymond);
		

		for (Person p : people) {
			System.out.println("Person with firstName " + p.getFirstName() + " has hobbies " + p.getHobbies());
		}
	}
	
	// feature 3. somebody (who?) whould make this jar runnable with this main class

}
