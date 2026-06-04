package day8;

public class Horse implements Animal {   //Horse class must override all the methods of the Animal interface
	@Override
	
	public void eat() {
		System.out.println("Horse is Eating");
	}
	public void sleep() {
		System.out.println("Horse is Sleeping");
	}
	public void run(){
		System.out.println("Horse is Running");
	}
}
