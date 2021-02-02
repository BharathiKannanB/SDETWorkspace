package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TwoDistinctIndices_Ques6 {

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
		int[] input = {1,2,3,1};
		int k=3;
		System.out.println(twoDistinctIndices_Solution1(input, k));
	}
	
	
	@Test
	public void datasetTwo() {
		int[] input = {1,2,3,1,2,3};
		int k=2;
		System.out.println(twoDistinctIndices_Solution1(input, k));
	}
	
	//@Test
	public void datasetThree() {
		int[] input = {2,5,7,3,1,5,6,4};
		int k=3;
		System.out.println(twoDistinctIndices_Solution1(input, k));
	}
	
	private boolean twoDistinctIndices_Solution1(int[] input, int k)
	{	
		int left=0; 
		int right=0;
		int size=k;
		//int[] output = new int[k];
		while(left<input.length-k)
		{
			if(input[left]==input[right]) {
			return true;
			}
			else right++; size--;
			if(size==0) {
				left++;
				right=left;
			}	
		}
		return false;
		
	}
		
}
