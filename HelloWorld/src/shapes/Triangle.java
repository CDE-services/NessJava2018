package shapes;

public class Triangle extends Shape {
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		String s = "";
        int i = 0;
        
        while(i < size) {
        	s += printChars(size - i - 1, ' ');
            s += printChars(2 * i++ + 1, '*');
            s += "\n";
        }
		return s;
	}

    private final String printChars(int length, char c) {
    	String s = "";
        for(int i = 0; i < length; i++) {
            s += c;
        }
        return s;
    }
}
