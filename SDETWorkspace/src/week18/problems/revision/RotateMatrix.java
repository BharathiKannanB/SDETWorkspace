package week18.problems.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RotateMatrix {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {1,2,3,4,5};
		int k=2;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((rotateMatrixSol2(input,k))));
	}

	/* DataSet2: */
	//@Test
	public void scenario2() {
		int[] input = {1,2,3,4,5};
		int k=5;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((rotateMatrixSol2(input,k))));
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		int[] input = {1,2,3,4,5};
		int k=0;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((rotateMatrixSol2(input,k))));
	}
	
	/* DataSet4: */
	//@Test
	public void scenario4() {
		int[] input = {1,2,3,4,5};
		int k=8;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((rotateMatrixSol2(input,k))));
	}
	
	/* DataSet5: */
	//@Test
	public void scenario5() {
		int[] input = {1,2,3,4,5};
		int k=-8;
		System.out.println("Output: ");
		System.out.println(Arrays.toString((rotateMatrixSol2(input,k))));
	}
	
	
	/* Solution 1: 
	 * Time Complexity: O[N]
	 * Space Complexity: O[N]
	 */
    
	public int[] rotateMatrixSol(int[] nums, int k) {
	int[] output = new int[nums.length];
	int len = nums.length;
	if(k==0 || k==len)
		return nums;
	if(k<0) {
		k=k%len;
		k= Math.abs(k+len);}
		int temp= k;
		for (int i = 0; i < len; i++) {
			if(temp>len-1)temp=temp%len;
			output[temp] = nums[i];
			temp++;	
		}
	return output;
	}
	
	/* Solution 2: 
	 * Time Complexity: O[N]
	 * Space Complexity: O[1]
	 */
    
	public int[] rotateMatrixSol2(int[] nums, int k) {
	int[] output = new int[nums.length];
	int len = nums.length;
	if(k==0 || k==len)
		return nums;
	if(k<0) {
		k=k%len;
		k= Math.abs(k+len);}
		int temp= k;
		for (int i = 0; i < len; i++) {
			if(temp>len-1)temp=temp%len;
			output[temp] = nums[i];
			temp++;	
		}
	return output;
	}

}
