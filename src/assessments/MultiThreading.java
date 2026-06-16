package assessments;

public class MultiThreading {

	public static void main(String[] args) {
		Armstrong thread1=new Armstrong();
		thread1.start();
		Prime thread2=new Prime();
		Thread t2= new Thread(thread2);
		t2.start();

	}

}
