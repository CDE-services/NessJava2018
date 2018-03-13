package shapes;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
//	public Square(char color) {
//		this(5);
//		super.color = color;
//	}

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
