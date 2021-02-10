package week17.problems.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SquareSort {
	
/*



PseudoCode:(Two Pointer)

1->Initialize instance, left, right variable,
2->Iterate through loop till left <= right
		  if input value of left not equal to i
		 	Increment 'instance'
		  if input value of left not equal to i
		 	Increment 'instance'
		  Increment left
		  Decrement Right
3-> Print 'instance'

		 
		 
*/
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {-8,-3,3,4,10};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((squareSortSol1(input))));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {0,1,2,3};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((squareSortSol1(input))));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {2,2,2};
		System.out.println("Output: ");
		System.out.println(Arrays.toString((squareSortSol1(input))));
	}
   
	
	
	/* Solution 1: Two Pointer 
	 * Time Complexity: O[N/2]
	 * Space Complexity: O[1]
	 */
    
	public int[] squareSortSol1(int[] nums) {
		int left=0,right=nums.length-1;
		int[] output = new int[nums.length];
		while(left<=right)
		{
			output[left]=nums[left]*nums[left];
			output[right]=nums[right]*nums[right];
			left++;
			right--;
		}
		Arrays.sort(output);
		return output;		
	}
	
	}
