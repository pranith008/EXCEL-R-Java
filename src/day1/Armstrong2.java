package day1;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		checkArmstrong(n);
	}

	private static void checkArmstrong(int n) {
		int sum=0;
		int rem=0;
		int bu=n;
		while(n>0) {
			rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		if(sum==bu) {
			System.out.println(bu +" is a Armstrong number");
		}
		else {
			System.out.println(bu+" is not a Armstrong number");
			
		}
		
	}

}
