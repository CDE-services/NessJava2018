package shapes;

public abstract /*final*/ class Shape {
	public static final char DEFAULT_COLOR = '*';
	
	private int x;
	private int y;
	protected char color = DEFAULT_COLOR;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape)) {
			return false;
		}
		Shape s = (Shape) obj;
		
		return this.x == s.getX() &&
				this.y == s.getY() &&
				this.color == s.getColor();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public char getColor() {
		return color;
	}
	
//	public abstract void move(int x, int y);
}
