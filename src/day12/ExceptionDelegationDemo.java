package day12;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDelegationDemo {  //caller

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();  
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();				//accept the input from user		-caller
		try
		{
		double result=divide(numerator,denominator);							
		System.out.println("Result is " +result);
		}
		catch(ArithmeticException ex1)              //exception handling			   
		{
			System.out.println("Enter valid denominator value");  
		}

	}
			//by using throws we delegate the handling of the exception to the caller
	private static double divide(int numerator, int denominator) throws ArithmeticException,IOException {      //callee
		
		return numerator/denominator;
	}

}
