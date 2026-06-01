package day2;

public class Primebw1to100 {

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 100");
		for(int n=1;n<=100;n++) {
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
