package assessments;

public class Armstrong extends Thread{
	public void run() {
		for(int n=1;n<=1000;n++) {
			int sum=0;
			int rem=0;
			int n1=n;
			
			while(n1>0) {
				rem=n1%10;
				sum+=rem*rem*rem;
				n1=n1/10;
			}
			if(sum==n) {
				System.out.println(n);
			}
			
		}
		
		
	}
}
