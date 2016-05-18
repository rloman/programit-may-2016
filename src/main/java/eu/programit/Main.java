package eu.programit;

import java.util.ArrayList;
import java.util.List;

import eu.programit.domain.*;

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		// feature 1.  add your person class

		Person raymond = new Raymond();
		Person jeffrey = new Jeffrey();
		Person rik = new Rik();
		Person remond = new Remond();
		Person hans = new Hans();
        Person henri = new Henri(); /* TODO: Assure singleton :) */

		// feature 2. add your own Person here
		people.add(raymond);
		people.add(jeffrey);
		people.add(rik);
		people.add(hans);
		people.add(remond);
        people.add(henri)

		for (Person p : people) {
			System.out.println("Person with firstName " + p.getFirstName() + " has hobbies " + p.getHobbies());
		}
	}
	
	// feature 3. somebody (who?) whould make this jar runnable with this main class
    
    // feature 4. (have we discussed deployment-pipelines via Jenkins already :) 

}
