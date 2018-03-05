import org.apache.derby.jdbc.ClientDriver;
import shapes.Line;
import shapes.Rectangle;

public class HelloWorld {
	public static void main(String[] args) {
		Line l = new Line();
		Rectangle r = new Rectangle(4, 4);
		
		System.out.printf("%10s: %d-%s", 
				"jahodka", 45, "malinka");
		
		System.out.println(r);
		
		ClientDriver cd;
		
		int a = 5;
		System.out.println("Cislo je parne: " + (a % 2 == 0 ? "ano" : "nie"));

		int size = 5;
		for (int i = 0; i < size; i = i + 3) {
			System.out.print("*");
		}

		/*
		 * short sh = Short.MAX_VALUE; System.out.println(sh);
		 * 
		 * int abc = Integer.MAX_VALUE; System.out.println(abc); abc = abc + 1;
		 * System.out.println(abc); long def = 123L; System.out.println(def);
		 * 
		 * def = abc; abc = (int) def;
		 * 
		 * char a = 'a'; System.out.println(a);
		 * 
		 * int cisloZoZnaku = 65; char bbb = (char) cisloZoZnaku;
		 * System.out.println("CISLO ZO ZNAKU: " + bbb); for (int i = 65; i < 65
		 * + 26; i++) { System.out.println("CISLO ZO ZNAKU: " + ((char) i)); }
		 * 
		 * int intova = Integer.MAX_VALUE; float floatova = intova;
		 * System.out.println("Int: " + intova + " float: " + floatova);
		 * 
		 * 
		 * boolean b = true; System.out.println(b);
		 * 
		 * // for (int i = 0; i < 5; i++) { //
		 * System.out.println("Hello World!"); // }
		 * 
		 * Person[] persons = { new Person(), new Employee(), new Student() };
		 * 
		 * for (int i = 0; i < persons.length; i++) {
		 * System.out.println(persons[i].getName()); }
		 * 
		 * Person p1 = new Person(); Person p2 = p1; p1.setAge(10);
		 * System.out.println(">>>>" + p2.getAge());
		 * 
		 * int x = 5; int y = x; x = 10; System.out.println(x);
		 * System.out.println(y);
		 * 
		 * 
		 * 
		 * int vek = 10; // boolean b = p.setAge(1000); //
		 * System.out.println(b);
		 * 
		 * 
		 * if (p1.setAge(vek)) { System.out.println( "Vek bol nastaveny: " +
		 * p1.getAge()); } else { System.out.println( "Nespravny vek: " + vek);
		 * }
		 * 
		 * p1.setName("Janko Hrasko"); System.out.println(p1.getName());
		 * 
		 * Employee e = new Employee(); e.setName("Peter Hruska");
		 * e.setAge(300); e.setPosition("Tester");
		 * System.out.println("Employee: "); System.out.println(e.getName());
		 * System.out.println(e.getAge()); System.out.println(e.getPosition());
		 * 
		 * Employee e1 = new Employee();
		 * 
		 * 
		 * Student s = new Student(); s.setName("Peter Hruska"); s.setAge(300);
		 * s.setIsicId("123456"); System.out.println("Student: ");
		 * System.out.println(s.getName()); System.out.println(s.getAge());
		 * System.out.println(s.getIsicId());
		 */
	}
}
