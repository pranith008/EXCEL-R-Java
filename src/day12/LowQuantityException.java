package day12;

public class LowQuantityException extends Exception{					  //Checked
//public class LowQuantityException extends RuntimeException              //unchecked
	String message;
	public LowQuantityException(String message) {
		super(message);
	}
}
