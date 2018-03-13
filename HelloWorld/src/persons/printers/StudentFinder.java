package persons.printers;

import persons.Person;
import persons.Student;

public class StudentFinder extends PersonFinder {
	Student[] students = {
			new Student("Janko", 15, "12355"),
			new Student("Hrasko", 15, "12356"),
			new Student("Juraj", 15, "12357"),
			new Student("Miska", 15, "12358"),
			new Student("Jaro", 15, "12359")
	};
	
	@Override
	public Student findPerson(String str) {
		for(Student s : students) {
			if(s.getIsicId().contains(str)) {
				return s;
			}
		}
		return null;
	}
}
