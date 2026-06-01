package day6;

public class DeepCopy {

	public static void main(String[] args) {
		Player p1=new Player(18,"Virat",100,5000);
		Player p2=new Player(p1);	//deep copy
		
		p2.setPname("Rohit");
		System.out.println(p1.getPname());//Virat
		System.out.println(p2.getPname());//Rohit
		
		System.out.println(p1==p2); //false
	}

}
