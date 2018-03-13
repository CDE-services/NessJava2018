package persons;
public class Student extends Person {
	private String isicId;
	
	public Student(String name, int age, String isicId) {
		super(name, age);
		this.isicId = isicId;
	}
	
	public String getIsicId() {
		return isicId;
	}
	
	public void setIsicId(String isicId) {
		this.isicId = isicId;
	}
	
//	public final boolean setAge(int age) {
//		super.age = age;
//	}

	@Override
	public String toString() {
		return super.toString() + ", " + getIsicId();
	}
}
