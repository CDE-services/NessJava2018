package shapes;

public class Shape {
	private int x;
	private int y;
	protected char color = '*';
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
