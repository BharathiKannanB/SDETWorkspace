package week16.problems.revision;

import java.util.Arrays;

import org.junit.Test;

public class SecondSmallest {
	
/*

PseudoCode:(Solution 1)

Initialize smallest and secondsmallest with maximum integer value

Iterate the input array in Loop through i
		if input i < smallest
				secondsmallest = smallest
				smallest = input i
		else if input i < secondsmallest
				secondsmallest = input i

Return secondsmallest
		 

PseudoCode:(Solution 2)


	 		 
*/
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {-5,1,5,-4,1,5,-2};
		System.out.println("Output: ");
		System.out.println(secondSmallest(input));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {1,2,3,1,2,3};
		System.out.println("Output: ");
		System.out.println(secondSmallest(input));
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		int[] input = {1,-5,4,-1,-2,2};
		System.out.println("Output: ");
		System.out.println(secondSmallest(input));
	}

	/* Solution 1: Brute Force */
     
	public int secondSmallest(int[] nums) {
		int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] < smallest) {
	            secondSmallest = smallest;
	            smallest = nums[i];
	        } else if (nums[i] < secondSmallest) {
	            secondSmallest = nums[i];
	        }
	    }
	    return secondSmallest;
	}
		
	/* Solution 2: */
    
	

}
