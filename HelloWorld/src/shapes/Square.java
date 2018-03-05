package shapes;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(int size) {
		super(size, size);
	}
	
	public int getSize() {
		return super.getHeight();
	}
	
	public void setSize(int size) {
		super.setHeight(size);
		super.setWidth(size);
	}
}
