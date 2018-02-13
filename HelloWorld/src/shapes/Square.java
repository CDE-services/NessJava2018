package shapes;

public class Square extends Shape {
	private int size;
	
	public Square(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        return sb.toString();
	}
}
