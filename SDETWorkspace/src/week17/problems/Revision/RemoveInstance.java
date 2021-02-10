package week17.problems.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveInstance {
	
/*

PseudoCode:(BruteForce)

1->Initialize 'instance' variable
2->Iterate the input array in Loop through i
		 if input value not equal to i
		 	Increment 'instance'
3-> Print 'instance'

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
		int[] input = {-5,1,5,-4,1,5,-2};
		int k=5;
		System.out.println("Output: ");
		System.out.println(removeInstanceSol2(input,k));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {5,5,5};
		int k=5;
		System.out.println("Output: ");
		System.out.println(removeInstanceSol2(input,k));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {-5,1,-4,1,-2};
		int k=5;
		System.out.println("Output: ");
		System.out.println(removeInstanceSol2(input,k));
	}

	/* Solution 1: Brute Force 
	 * Time Complexity: O[N]
	 * Space Complexity: O[1]
	 */
   
	public int removeInstanceSol1(int[] nums, int k) { 
		int instance=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=k)instance++;
		}
		return instance;
		
	}
	
	
	/* Solution 2: Two Pointer 
	 * Time Complexity: O[N/2]
	 * Space Complexity: O[1]
	 */
    
	public int removeInstanceSol2(int[] nums, int k) {
		int instance=0, left=0,right=nums.length-1;
		while(left<=right) {
			if(nums[left]!=k) {instance++;
			if(left==right) break;}
			if(nums[right]!=k)instance++;
			left++;
			right--;
		}
		return instance;		
	}
	
	
	/* Solution 3: Brute Force
	 * Time Complexity: O[N]
	 * Space Complexity: O[N]
	 */
    
	public int removeInstanceSol3(int[] nums, int k) {
		int instance=0;
		
		return instance;	
	}
	
	}
