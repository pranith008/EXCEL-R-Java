package day12;

public class InvalidNameException extends Exception{
	String message;
	public InvalidNameException(String message) {
		super(message);
	}
}
