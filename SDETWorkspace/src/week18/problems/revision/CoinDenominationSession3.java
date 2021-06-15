package week18.problems.revision;

import java.util.Arrays;

import org.junit.Test;

public class CoinDenominationSession3 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {1,2,5};
		int k=11;
		System.out.println("Output: ");
		System.out.println(coinDenominationSol(input,k));
	}
	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {5,10,15};
		int k=11;
		System.out.println("Output: ");
		System.out.println(coinDenominationSol(input,k));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {10,20,50};
		int k=5;
		System.out.println("Output: ");
		System.out.println(coinDenominationSol(input,k));
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		int[] input = {5,2,1};
		int k=11;
		System.out.println("Output: ");
		System.out.println(coinDenominationSol(input,k));
	}

	
	
	/* Solution 1: 
	 * Time Complexity: O[N]
	 * Space Complexity: 
	 */
    
	public int coinDenominationSol(int[] nums, int k) {
	Arrays.sort(nums);
	int trav = nums.length-1, curr=k, output=0, temp;
	while(trav>=0){
	temp = curr/nums[trav] ;
	curr = curr%nums[trav] ;
	if(temp==0) trav--;	
	else output += temp;
	if(curr==0) break;
	}
	if(curr!=0) return -1;
	else return output;
	}
}
