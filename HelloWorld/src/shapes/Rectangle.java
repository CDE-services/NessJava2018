package shapes;

import java.util.Formatter;

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
		Formatter sb = new Formatter();
		
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				sb.format("%2s", super.color);
			}
			sb.format("\n");
		}
		
		return sb.toString();
	}
}
