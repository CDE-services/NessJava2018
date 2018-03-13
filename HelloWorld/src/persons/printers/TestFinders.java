package persons.printers;

import persons.*;

public class TestFinders {
	public static void main(String[] args) {
		PersonFinder pp = new PersonFinder();
		
//		Person p = pp.findPerson("6");
		
//		System.out.println(p);
//		System.out.println(p.getClass());
		
		Person[] persons = pp.sort();
		for(Person pers : persons) {
			System.out.println(pers);
		}
	}
}
