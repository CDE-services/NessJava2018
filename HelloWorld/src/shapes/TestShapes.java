package shapes;

public class TestShapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 5, 7);
		Triangle t2 = new Triangle(3, 5, 3);
		
		System.out.println(t1 == t2);
		System.out.println(t2.equals(t1));
		
		String s1 = "ahoj";
		String s2 = "ahoj";
		String s3 = s1;
		s1 += "jahodka";
		s2 += "jahodka";
		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s3 == s1);
//		System.out.println(s3.equals(s1));
		
//		t.setSize(4);
//		System.out.println(t);
		
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
