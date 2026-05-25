package day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}

	}

}
