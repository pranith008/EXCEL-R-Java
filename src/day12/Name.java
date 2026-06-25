package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your Name");
			String name=sc.nextLine();
			if(name.contains(" ") ) {
				throw new InvalidNameException("Invalid Name");
			}
			else {
				System.out.println("Name is valid");
			}
		}
		catch(InvalidNameException ex1) {
			System.out.println(ex1.getMessage());
		}
		catch(InputMismatchException ex2) {
			System.out.println("Please Enter Valid Details");
		}
	}

}
