package day2;
//ctrl shift o  to remove unwanted imports

public class PrimefromArray3 {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 7, 9, 11, 19, 23, 97, 53};
		int[] primes = new int[numbers.length];
		
		int index = 0;
		 
		for (int i = 0; i < numbers.length; i++) 
		{
			if (checkPrime(numbers[i])) 
				{
				primes[index++] = numbers[i];
				}
		}
		for(int i=0;i<index;i++) {
			System.out.println(primes[i]);
		}

	}
		

	private static boolean checkPrime(int n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
			}
		}

		return counter==2? true:false;
	}

}
