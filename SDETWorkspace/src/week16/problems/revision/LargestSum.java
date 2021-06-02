package week16.problems.revision;

import java.util.Arrays;

import org.junit.Test;

public class LargestSum {
	
/*

PseudoCode:(BruteForce)

Initialize Max and Temp 
Iterate the input array in Loop 1 through i
		Assign Temp value to first value of i
	Iterate the input array in Loop 2 start from i+1
		 Sum all the values to Temp
		 Max of (Temp & Max) - Assign to Max
		 

PseudoCode:(SlidingWindow)

Initialize Left, Right , CurrentSum and MaxSum
Iterate the input array in Loop through i
		currentSum is sum of input and currentSum
		Max of (currentSum & MaxSum) - Assign to MaxSum

		 
		 
*/
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {-5,1,5,-4,1,5,-2};
		System.out.println("Output: ");
		System.out.println(largestSum2(input));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {1,2,3,1,2,3};
		System.out.println("Output: ");
		System.out.println(largestSum2(input));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {1,-5,4,-1,-2,2};
		System.out.println("Output: ");
		System.out.println(largestSum2(input));
	}

	/* Solution 1: Brute Force */
     
	public int largestSum(int[] nums) {
				int max=0,temp=0;
		 for (int i = 0; i < nums.length; i++) {
			 	temp = nums[i];
		         max = Math.max(temp, max);
		        for (int j = i+1; j < nums.length; j++) {
		            temp = temp+nums[j];
		            max = Math.max(temp, max);
		        }
		    }	    return max;
}
	
	
	/* Solution 1: SlidingWindow */
    
	public int largestSum2(int[] nums) {
		int left = 0;
	    int right = 0;
	    int currentSum = 0;
	    int max = 0;
	    while (left < nums.length) {
	        if (right < nums.length && currentSum >= 0) {
	        	currentSum = currentSum+nums[right++];
	        } else {
	        	currentSum = currentSum-nums[left++];
	        }
	        if (currentSum > max && left != right) { 
	            max = currentSum;
	        }
	    }
	    return max;
}
}
