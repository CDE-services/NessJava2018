package shapes;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle";
	}
}
