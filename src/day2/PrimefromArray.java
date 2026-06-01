package day2;

public class PrimefromArray {

	public static void main(String[] args) {
		System.out.println("Prime numbers are");
		int numbers[]= {7,9,11,20,21,60,97};
		for(int n:numbers) {
			if(checkPrime(n)) {
				System.out.println(n);
			}
		}
	}

	private static boolean checkPrime(int n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			return true;
		} else {
			return false;
					
		}
	}

}
