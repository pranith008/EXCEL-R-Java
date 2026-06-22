package day20;

public class Driver {

	public static void main(String[] args) {
//		
//		Sample s1=null;  //		P p = new C();
//		
//		s1=new GoodMorning(); //eligible candidate for Garbage Collection
//		s1.greet();
//		
//		s1=new GoodAfternoon();
//		s1.greet();
//		
//		s1=new GoodEvening();
//		s1.greet();
//		
//		s1=new GoodNight();
//		s1.greet();
		
		Sample s2=null;
		
		s2=()-> System.out.println("Good Morning Pranith !!");
		s2.greet();
		
		s2=()-> System.out.println("Good Afternoon Pranith !!");
		s2.greet();
		
		s2=()-> System.out.println("Good Evening Pranith !!");
		s2.greet();
		
		s2=()-> System.out.println("Good Night Pranith !!");
		s2.greet();
		
		System.out.println("-----------------------------------------");
		
		Shape s3= radius-> Math.PI*radius*radius;
		
		System.out.println(s3.area(5));
		
		double ans=s3.area(6);
		
		System.out.println(ans);
		
		SamplePro s4=(nm,ct)-> System.out.println("Hello  "+nm +" , Welcome to "+ct);
		
		s4.greet("Pranith","Hyderabad");
		s4.greet("SreeLeela","Hyderabad");
			


	}

}
