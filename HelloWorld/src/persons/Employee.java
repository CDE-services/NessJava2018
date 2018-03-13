package persons;
public class Employee extends Person {
	private String position;
	
	public Employee(String name, int age, String position) {
		super(name, age);
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
}