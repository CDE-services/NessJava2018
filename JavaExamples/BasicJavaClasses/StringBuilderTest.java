
public class StringBuilderTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		String a = "a";

		String b = "b";
		
		StringBuilder sb = new StringBuilder(1000);

		for (int i = 0; i < 1000; i++) { //ten million times
		     //String c = a.concat(b); //539 - creates a new array and performs a copy of both a and b
//		     String c = a + b + a + b + a + b; //1141 == new StringBuilder.append(a).append(b).toString();
			
			sb.append(a).append(b);//230 //has an internal array buffer, most effective
//			String s = sb.toString(); //looong time - dont do this in a loop
		}

		System.out.println(sb.toString());
		
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
