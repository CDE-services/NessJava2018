package persons.printers;

import java.util.Arrays;
import java.util.Comparator;

import persons.Person;

public class PersonFinder {
	Person[] persons = {
			new Person("Janko", 15),
			new Person("Hrasko", 15),
			new Person("Juraj", 15),
			new Person("Miska", 15),
			new Person("Jaro", 15)
	};
	
	public Person[] sort() {
		Arrays.sort(persons, new PersonComparator());
		return persons;
	}
	
	public Person findPerson(String str) {
		for(Person p : persons) {
			if(p.getName().contains(str)) {
				return p;
			}
		}
		return null;
	}
}
