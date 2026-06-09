package assessments;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String studName;
	private int mark1;
	private int mark2;
	private int mark3;
	private int totalMarks;
	
	public void setStudentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		this.rollNo =sc.nextInt();
		System.out.println("Enter Student Name");
		this.studName =sc.next();
		System.out.println("Enter marks of First subject");
		this.mark1=sc.nextInt();
		System.out.println("Enter marks of Second subject");
		this.mark2=sc.nextInt();
		System.out.println("Enter marks of Third subject");
		this.mark3=sc.nextInt();	
	}
	public void calculateTotal() {
		this.totalMarks=this.mark1+this.mark2+this.mark3;
	}
	public void displayStudDetails() {
		System.out.println("Student Roll No is "+this.rollNo);
		System.out.println("Student Name is "+this.studName);
		System.out.println("Total Marks of the Student is "+this.totalMarks);
	}
}
