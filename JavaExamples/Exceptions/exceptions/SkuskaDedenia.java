package exceptions;

public class SkuskaDedenia {
	public void metoda() throws WrongFormatException {
		throw new WrongFormatException("toto je nejaka moja chyba");
	}
}
