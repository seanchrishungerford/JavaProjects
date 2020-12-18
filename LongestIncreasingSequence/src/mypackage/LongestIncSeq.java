package mypackage;

import java.util.Arrays;
import java.util.LinkedList;

public class LongestIncSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] originalArray = new int[100];
		
		for(int i = 0 ; i < 10; i++) {
			originalArray[i] = (int)(Math.random() * 100);	
		}
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println(originalArray[i]); 	
		}		
		
		
		int[] indexArray = new int[10];
		
		for(int i = 0 ; i < 10; i++) {
			indexArray[i] = 101;	
		}
		
		LinkedList<Integer> indexList = new LinkedList<Integer>();
		int sequenceLength = 0;
		int count = 0;
		int n = 1;
		int max = 0;
					for(int i = 0 ; i < 9; i++) {
					
						if(originalArray[i] < originalArray[i+n] && originalArray[i+n] > max) {
							//indexList.add(originalArray[i]);
							//indexList.add(originalArray[j]);
							//indexArray[i-n] = i;
							indexArray[i] = i;
							
							max = originalArray[i+n];
							}
							else {
								indexArray[i] = 101;
							}
							n++;
						}

		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(indexArray[i]);
		}
		
		
		
	}

}
