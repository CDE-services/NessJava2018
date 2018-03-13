package days;

public class TestParametricEnum {
	public static void main(String[] args) {
		DayEnum e1 = DayEnum.NED;
		DayParametricEnum e2 = DayParametricEnum.NED;
		
		if(e1 == DayEnum.PON) {
			System.out.println("Pondelisko");
		}
		
		System.out.println(e2.getStrName());
//		System.out.println("Day number: " + e2.getDayNumber());
		System.out.println("Day number (better): " 
		+ (e2.ordinal() + 1));
		
		for(DayParametricEnum d : DayParametricEnum.values()) {
			System.out.println("Den: " + d + " (" + (d.ordinal() + 1) + ")");
		}
		
		System.out.println(DayParametricEnum.values()[4]);
	}
}
