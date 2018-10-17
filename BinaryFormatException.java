import java.util.*;
public class BinaryFormatException extends Exception {
	
	private String s;
	
	public BinaryFormatException(String s) {
		super("Invalid Binary Number: " + s);
		this.s = s;
	}
	public String getString() {
		return s;
	}
	
}
