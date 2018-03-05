package shapes;

public enum Color {
	RED('@'), BLUE('#'), GREEN('&'), YELLOW('*');
	
	private char character;
	
	private Color(char character) {
		this.character = character;
	}
	
	public char getCharacter() {
		return character;
	}
}
