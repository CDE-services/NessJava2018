package instanceOf.better;

public class Fish extends Animal {
	private void swim() {
		//...
	}
	
	@Override
	public void move() {
		System.out.println("Move like a fish...");
		this.swim();
	}
}