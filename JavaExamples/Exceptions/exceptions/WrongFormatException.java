package exceptions;

public class WrongFormatException extends Exception {
    /**
     * Constructor.
     * @param message message
     */
    public WrongFormatException(String message) {
        super(message);
    }

	public WrongFormatException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public WrongFormatException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
    
    
}
