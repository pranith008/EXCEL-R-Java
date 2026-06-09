package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WholeSaver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Please Enter Quantity ");
			int qty=sc.nextInt();
			if(qty<500) {
				throw new LowQuantityException("Please enter qty greater than 500"); //to explicitly raise an exception we use throw keyword
			}
			else {
				System.out.println("Order is Successful");
			}
		}
		catch(LowQuantityException ex1) {
			System.out.println(ex1.getMessage());
		}
		catch(InputMismatchException ex2) {
			System.out.println("Please Enter Valid Details");
		}
	}

}
