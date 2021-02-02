package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MaxSumSubarray_Ques5 {

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
		int[] input = {4,2,11,1,23,2,3,15,14};
		int k=3;
		System.out.println(maxSumSubarray_Solution1(input, k));
	}
	
	
	@Test
	public void datasetTwo() {
		int[] input = {4,2,1,-7,23,2,-3,15,14};
		int k=4;
		System.out.println(maxSumSubarray_Solution1(input, k));
	}
	
	@Test
	public void datasetThree() {
		int[] input = {2,5,7,3,1,5,6,4};
		int k=3;
		System.out.println(maxSumSubarray_Solution1(input, k));
	}
	
	private int maxSumSubarray_Solution1(int[] input, int k)
	{	
		int wSum=0; 
		int mSum=0;
		int[] output = new int[k];
		for (int i = 0; i < k; i++) {
			wSum +=input[i];
		}	
		for(int j=k;j<=input.length;j++)
			{wSum += input[j]-input[j-k];		
			mSum = Math.max(wSum, mSum);
			}
		return mSum;
	}
		
}
