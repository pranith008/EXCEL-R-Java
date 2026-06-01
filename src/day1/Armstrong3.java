package day1;

import java.util.Scanner;

public class Armstrong3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		if(checkArmstrong(n)) {
			System.out.println(n +" is a Armstrong number");
		}
		else {
			System.out.println(n+" is not a Armstrong number");
			
		}
	}

	private static boolean checkArmstrong(int n) {
		int sum=0;
		int rem=0;
		int bu=n;
		while(n>0) {
			rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		if(sum==bu) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
