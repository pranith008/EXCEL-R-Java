package day1;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int rem=0;
		int bu=n;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("The sum of digits of "+ bu +" is "+ sum);
	}

}
