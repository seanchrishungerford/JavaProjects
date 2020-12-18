package mypack;

public class LongestIncSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] origArray = new int[100]; //Array that contains the original sequence.
		
		int[] longestArray = new int[100]; //Array that will help count the longest subsequence
		int[] subSeqArray = new int[100];
		int max = 1;
        
		//Initialize the arrays:
		for(int i = 0; i < origArray.length; i++) {	
			origArray[i] = (int)(Math.random() * 100); //random number between 0 and 99
			subSeqArray[i] = -1;
		}
		//Double for-loop:
		for(int i = 1; i < longestArray.length; i++) {
			int maxValue =  0;
			for(int j = 0; j < i; j++) {

				if(origArray[j] < origArray[i]) {
					maxValue = Math.max(maxValue, longestArray[j]);
				}
	
			}//inner for loop
			longestArray[i] = maxValue + 1;
			max = Math.max(max, longestArray[i]);
			
		}//outer for loop
		
		//Output longest increasing subsequence length:
		System.out.println("Longest increasing subsequence length: " + max);
		
		System.out.println("Original suqsequence: ");
		for(int i = 0; i < origArray.length; i++) {
			System.out.println(origArray[i]);
		}
		
	}

}
