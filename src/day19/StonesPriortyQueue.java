package day19;

import java.util.Collections;
import java.util.PriorityQueue;

public class StonesPriortyQueue {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int weight=stones(arr);
		System.out.println("The stones weight is "+ weight+" kg");
	}

	private static int stones(int[] arr) {
		PriorityQueue<Integer> pque=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int stones:arr) {
			pque.add(stones);
		}
		
		while(pque.size()>1) {
			int first=pque.remove();
			int second=pque.remove();
			
			if(first!=second) {
				pque.add(first-second);
			}
			
		}
		if(pque.isEmpty()) {
			return 0;
		}
		else {
			return pque.remove();
		}
		
	}

}
