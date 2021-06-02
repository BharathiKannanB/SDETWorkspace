package week16.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;


public class TwoSum {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {1,5,7,1,2};
		int target = 8; 
		System.out.println("Output: ");
		System.out.println(Arrays.toString(twoSum(input, target)));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {1,5,7,1,6,2};
		int target = 8; 
		System.out.println("Output: ");
		System.out.println(Arrays.toString(twoSum(input, target)));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {1,5,4,1,9,2};
		int target = 8; 
		System.out.println("Output: ");
		System.out.println(Arrays.toString(twoSum(input, target)));
	}

	/* Solution 1: Brute Force */
     
	public int[] twoSum(int[] nums, int target) {
		int count=0;
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j]==target-nums[i]) {
	            	 count++;
	                return new int[] { i, j };
	            }
	        }
	    }
		return new int[] {};
    }
}
