package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FirstDuplicate_Ques7 {

	/*  Pseudocode : 
	 * 
	Solution 1: Sliding Window
	 
	Step 1: Initialize windowSum, maxSum, output array and pointer variable. 
	Step 2: Loop input array until k 
	 				-> Sum all values to windowSum.
	Step 3: Iterate until pointer < input array length
		Step 3.1: Add input[pointer] and Subtract input[pointer-k] to windowSum
		Step 3.2: maxSum = maximum of maxSum and windowSum					
	Step 4: Print the windowSum     */
	
	@Test
	public void datasetOne() {
		int[] input = {4,1,2,9,1};
		int k=3;
		System.out.println(firstDuplicate_Solution1(input));
	}
	
	
	@Test
	public void datasetTwo() {
		int[] input = {1,2,3,1,2,3};
		int k=2;
		System.out.println(firstDuplicate_Solution1(input));
	}
	
	//@Test
	public void datasetThree() {
		int[] input = {2,5,7,3,1,5,6,4};
		int k=3;
		System.out.println(firstDuplicate_Solution1(input));
	}
	
	private int firstDuplicate_Solution1(int[] input)
	{
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j])
					return input[i];
			}
		}
		return 0;
		
		
	}
		
}
