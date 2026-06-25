package day24;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> numbers=new CopyOnWriteArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers.size());  //5
		
		for(int n:numbers)
		{
			numbers.add(6);
		}
		
		System.out.println(numbers);

		System.out.println(numbers.size());  //10
	}

}
