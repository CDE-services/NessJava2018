package persons.printers;

import java.util.Comparator;

import persons.Person;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
