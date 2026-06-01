package day3;

public class Stringequalitydemo {

	public static void main(String[] args) {
		String name1="virat";
		String name2="Virat";
		
		System.out.println(name1.equals(name2));	//equals  textual/data  comparison
													//equals case sensitive   a =! A
		
		System.out.println(name1.equalsIgnoreCase(name2));

	}

}
