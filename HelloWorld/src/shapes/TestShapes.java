package shapes;

public class TestShapes {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setSize(4);
		System.out.println(t);
		
		Square s = new Square(5);
//		s.setSize(5);
		System.out.println(s);
		
		Rectangle r = new Rectangle(5, 8);
//		r.setWidth(5); r.setHeight(8);
		System.out.println(r);
		
		Line l = new Line();
		l.setLength(10);
		System.out.println(l);
	}

}
