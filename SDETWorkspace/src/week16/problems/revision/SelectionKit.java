package week16.problems.revision;

import java.util.Arrays;

import org.junit.Test;

public class SelectionKit {
		
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {5,3,4,1,2};
		System.out.println("Output: ");
		System.out.println(selectionKitSol(input));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {1,2,3,1,2,3};
		System.out.println("Output: ");
		System.out.println(selectionKitSol(input));
	}
	

	/* Solution 1:*/
     
	public int selectionKitSol(int[] nums) {
		int totalSum=0, currentSum=0;
		int output=0;
		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if(totalSum/currentSum<2) {
				output=i+1;
				break;
			}		
		}
		return output;
			
}
	
	
	
}
