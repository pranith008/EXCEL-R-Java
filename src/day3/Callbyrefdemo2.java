package day3;

public class Callbyrefdemo2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30};	
		System.out.println("1st Element of Array A=" + arr[0]); //A = 10				1st A = 10
		test(arr);					//						2nd B = 10
		System.out.println("1st Element of Array A=" + arr[0]); //A = 10				3rd B = 99
	}									//					4th A = 10	

	private static void test(int brr[]) 
	{
		System.out.println("1st Element of Array B=" + brr[0]); //B = 10
		brr[0]=99;
		System.out.println("1st Element of Array B=" + brr[0]); //B = 99

	}

}
