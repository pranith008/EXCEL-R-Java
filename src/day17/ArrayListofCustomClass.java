package day17;

import java.util.ArrayList;

public class ArrayListofCustomClass {

	public static void main(String[] args) {
		ArrayList<Student> fyStudents=new ArrayList();
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",98.5);
		
		fyStudents.add(s1);
		fyStudents.add(s2);
		fyStudents.add(s3);
		
		System.out.println(fyStudents);
		
		//display name of the 2nd student
		System.out.println(fyStudents.get(1).getSname());
		
		
		ArrayList<Student> syStudents=new ArrayList();
		Student s4=new Student(77,"Shubman",78.5);
		Student s5=new Student(3,"Vaibhav",88.5);
		Student s6=new Student(33,"Hardik",98.5);
		
		syStudents.add(s4);
		syStudents.add(s5);
		syStudents.add(s6);
		
		ArrayList<ArrayList<Student>> cricket=new ArrayList();
		cricket.add(fyStudents);
		cricket.add(syStudents);
		
		System.out.println(cricket);
		
		//display name of first student of fy  using cricket
		System.out.println(cricket.get(0).get(0).getSname());
		
		//display name of first student of all classes
		System.out.println("-------");
		for(ArrayList<Student> year:cricket)
		{
			System.out.println(year.get(0).getSname());
		}

	}

}
