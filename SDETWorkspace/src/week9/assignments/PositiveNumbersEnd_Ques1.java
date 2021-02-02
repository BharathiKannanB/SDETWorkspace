package week9.assignments;

import org.junit.Test;

public class PositiveNumbersEnd_Ques1 {

	/*  Pseudocode : 
	 * 
	Solution 1: Two Pointer
	 
	Step 1: Initialize variable left and right value
	Step 2: Iterate until right value is less than length of input
		Step 2.1: Inside Loop, If Left value is positive && Right value is non-positive 
		 				->	Swap Right and Left Value, Increment Left
		Step 2.2: Increment Right  
	Step 3: Print the  Array     */
	
	@Test
	public void datasetOne() {
		int[] input = {4, -1, 9, 0, 2, -4, 5};
		System.out.println("Output: ");
		for(int i:positiveNumbersEnd_Solution1(input)) {	
			System.out.print(" "+i);}
		System.out.println("");
	}
	
	
	@Test
	public void datasetTwo() {
		int[] input = {-4, -1, -9, 0, 2, 4, 5};
		System.out.println("Output: ");
		for(int i:positiveNumbersEnd_Solution1(input)) {	
			System.out.print(" "+i);}
		System.out.println("");
	}
	
	@Test
	public void datasetThree() {
		int[] input = {4, 9, 2, 5};
		System.out.println("Output: ");
		for(int i:positiveNumbersEnd_Solution1(input))	
			System.out.print(" "+i);
	}
	
	private int[] positiveNumbersEnd_Solution1(int[] input)
	{	
	int left=0; 
	int right=1;
	int temp;
	while(right<input.length)
	{
		if(input[left]>0&&input[right]<=0)
		{
			temp=input[left];
			input[left]=input[right];
			input[right]=temp;
			left++;	
		}
			right++;	
	}
		return input;	
	}
	
	/* Maintaining Order */
	
	private int[] positiveNumbersEnd_Solution2(int[] input)
	{	
		int start=0,left=0;
		int end=input.length-1,right=input.length-1;
		int[] output = new int[input.length];

		while(start<input.length) {
			if(input[start++]<1)
				output[left++]=input[start-1];
			if(input[end--]>0)
				output[right--]=input[end+1];
		}
		return output;
	}
	
	
}
