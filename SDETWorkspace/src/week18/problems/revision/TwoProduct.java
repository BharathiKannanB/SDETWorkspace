package week18.problems.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoProduct {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {2,7,11,4,15};
		int k=8;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((twoProductSol(input,k))));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {-2,7,-11,4,15};
		int k=-8;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((twoProductSol(input,k))));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {1,2,1,2};
		int k=2;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((twoProductSol(input,k))));
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		int[] input = {1,1,1,2,2,3};
		int k=3;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((twoProductSol(input,k))));
	}

	
	
	/* Solution 1: Hashing
	 * Time Complexity: O[N]
	 * Space Complexity: 
	 */
    
	public int[] twoProductSol(int[] nums, int k) {
	Map<Integer, Integer> input = new HashMap<>();
	int[] output = new int[2];
	int temp;
	for(int i=0; i<nums.length; i++){
	temp = k/nums[i];
	if(input.containsKey(temp)){
	output[0] = input.get(temp);
	output[1] = i;
	return output;
	}
	else input.put(nums[i],i);	
	}
	return output;
	}

}
