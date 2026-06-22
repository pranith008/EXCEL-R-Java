package day21;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Shape s1=radius->Math.PI*radius*radius;
		System.out.println(s1.area(5.0));
		
		Shape s2=MethodReferenceDemo::test;
		System.out.println(s2.area(7.0));
		
		myPrint("mamidi pranith");
		
		Printer p1=st->System.out.println(st.toUpperCase());
		p1.printName("mamidi pranith");
		
		Printer p2=MethodReferenceDemo::myPrint;
		p2.printName("Mamidi Pranith");
		
		MethodReferenceDemo mrd=new MethodReferenceDemo();
		
		Printer p3=mrd::myDisplay;
		p3.printName("Mamidi Pranith");
		
		
		Printer p4=String::toUpperCase;
		
		
		
	}
	
	public static double test(double r) {
		return Math.PI*r*r;
	}
	
	public static void myPrint(String str) {
		System.out.println(str.toUpperCase());
	}
	
	public void myDisplay(String str) {
		System.out.println(str.toLowerCase());
	}
}
