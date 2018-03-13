package shapes;

import persons.CompareObject;

public abstract class Shape implements CompareObject {
    private int color;

    public Shape() {
        this(0);
    }

    public Shape(int color) {
        this.color = color;
    }

    public abstract void move(int dx, int dy);

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String toString() {
        return ": color = " + color;
    }
    
    public int compareTo(CompareObject obj) {
    	if(!(obj instanceof Shape)) return -1;
    	Shape s = (Shape) obj;
    	if(s.color == this.color) {
    		return 0;
    	}
    	if(s.color > this.color) {
    		return -1;
    	} else {
    		return 1;
    	}
    }
}
