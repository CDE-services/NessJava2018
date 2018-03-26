package exceptions;

public class SkuskaDedenia2 extends SkuskaDedenia {
	@Override
	public void metoda() throws MojaDalsiaVynimka {
		
	}
	
	public class MojaDalsiaVynimka extends WrongFormatException {
		public MojaDalsiaVynimka(String message) {
			super(message);
		}
	}
}
