package eu.programit;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import eu.programit.domain.Person;
import eu.programit.domain.Raymond;
import eu.programit.domain.Jeffrey;
import eu.programit.domain.Jan;
=======
import eu.programit.domain.*;
>>>>>>> ba7c0d2473d227d9cbdcf8a475939ccb68bf433f

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		// feature 1.  add your person class

		Person raymond = new Raymond();
<<<<<<< HEAD
        Person jeffrey = new Jeffrey();
        Person jan = new Jan();

		// feature 2. add your own Person here
		people.add(raymond);
        people.add(jeffrey);
        people.add(jan);
=======
		Person jeffrey = new Jeffrey();
		Person rik = new Rik();
		Person remond = new Remond();

		// feature 2. add your own Person here
		people.add(raymond);
		people.add(jeffrey);
		people.add(rik);
		people.add(remond);
>>>>>>> ba7c0d2473d227d9cbdcf8a475939ccb68bf433f

		for (Person p : people) {
			System.out.println("Person with firstName " + p.getFirstName() + " has hobbies " + p.getHobbies());
		}
	}
	
	// feature 3. somebody (who?) whould make this jar runnable with this main class

}
