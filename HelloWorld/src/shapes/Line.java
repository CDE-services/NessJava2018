package shapes;

public class Line extends Shape {
	private int length;
	
	public Line() {
		super(0, 0);
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "Line";
	}
}
