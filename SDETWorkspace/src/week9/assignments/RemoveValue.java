package week9.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RemoveValue {

	/*  Pseudocode : 
	 * 
	Solution 1: Two Pointer
	 
	Step 1:	Initialize output, start and end
	Step 2: Iterate the input array from start value
	Step 3: Decrement the end value inside the same loop
	Step 4: If start or end value does not matches 'n' value, store the value in an Output arraylist
	Step 5: Print the Ouput arraylist and its length
	

		/* DataSet1: */
		@Test
		public void scenario1() {
			int[] input = {5, 0, 3, 3, 4, 3, 5,3};
			int n=3;
			System.out.println("Output: ");
			System.out.println(RemoveValueSolution1(input, n));
		}

		/* DataSet2: */
		@Test
		public void scenario2() {
			int[] input = {1,2,4};
			int n=3;
			System.out.println("Output: ");
			System.out.println(RemoveValueSolution1(input, n));
		}

		/* DataSet2: */
		@Test
		public void scenario3() {
			int[] input = {2,2,2};
			int n=2;
			System.out.println("Output: ");
			System.out.println(RemoveValueSolution1(input, n));
		}
		

		/* Solution 1: Two Pointer*/

		public int RemoveValueSolution1(int[] input1, int n) {
			
			//char[] inputArray = input1.toCharArray();
			int end=input1.length-1;
			List<Integer> opArray = new ArrayList<Integer>();
			int i=0;
			for(int start=0;start<=input1.length-1;start++)
			{
				if(input1[start]!=n)
					opArray.add(input1[start]);
				if(input1[end]!=n) {
					opArray.add(input1[end]);}
				end--;
				if(start==end)
					break;
			}			
			return opArray.size();	
		}
		
}
		



