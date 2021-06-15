package week18.problems.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SortedArray {

	/* DataSet1: */
	//@Test
	public void scenario1() {
		int[] input = {1,2,3,4,5};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((sortArraySol(input))));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {5,1,4,3,2};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((sortArraySol(input))));
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		int[] input = {1,2,3,4,5};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((sortArraySol(input))));
	}
	
	/* DataSet4: */
	//@Test
	public void scenario4() {
		int[] input = {1,2,3,4,5};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((sortArraySol(input))));
	}
	
	/* DataSet5: */
	//@Test
	public void scenario5() {
		int[] input = {1,2,3,4,5};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((sortArraySol(input))));
	}
	
	
	/* Solution 1: 
	 * Time Complexity: O[N]
	 * Space Complexity: O[N]
	 */
    
	public int[] sortArraySol1(int[] nums) {
	int[] output = new int[nums.length];
	
	int i=0,left=0, right=nums.length-1;
	while(left<=right) {
		if(i%2==0)	{
		output[i]= nums[right--];}
		if(i%2==1) {
		output[i]= nums[left++];}
		i++;
	}
	return output;
	}
	
	/* Solution 2: 
	 * Time Complexity: O[N]
	 * Space Complexity: O[1]
	 */
    
	public int[] sortArraySol(int[] nums) {
		
		
		
		return nums;
		
		}

}
