/**
 * Trieda reprezentujuca osobu.
 * @author Michaela
 */
public class Person {
	/**
	 * Meno osoby
	 */
	private String name;
	/**
	 * Vek osoby
	 */
	private int age;
	
	/**
	 * Getter pre meno osoby
	 * @return meno osoby v stringovom formate
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter pre meno osoby
	 * @param name meno, ktore ma osoba mat nastavene
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Metoda nastavi vek, 
	 * ak je menej ako 0 a viac ako 150,
	 * nenastavi ho.
	 * @param age vek, ktory sa ma nastavit (musi byt medzi 0 a 150)
	 * @return true, ak bol vek spravny, false inac
	 */
	public boolean setAge(int age) {
		if(isValidAge(age)) {
			this.age = age;
			return true;
		} else {
			return false;
		}
	}

	private boolean isValidAge(int ageNew) {
		return ageNew >= 0 && ageNew <= 150;
	}
}
