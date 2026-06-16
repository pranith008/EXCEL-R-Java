package day14;

public class Gama extends Thread {						//Question : does the java.lang.Thread class contain a para const which
														//takes String as an arguement?
														//Answer : Yes
	public Gama(String threadName)  //"Alpha"
	{
		super(threadName);
	}
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=2001;i<=3000;i++)
	{
		System.out.println("\t\t"+i);
	}
}
//@Override
//public void start()					//can we override the start() ? 
//{
//		System.out.println("FIFA World Cup 2026");
//}
}
