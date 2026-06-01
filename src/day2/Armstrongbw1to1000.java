package day2;

public class Armstrongbw1to1000 {

	public static void main(String[] args) {
		System.out.println("Armstrong Numbers between 1 to 1000");
		for(int n=1;n<=1000;n++) {
			if(checkArmstrong(n)) {
				System.out.println(n);
			}
			
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
