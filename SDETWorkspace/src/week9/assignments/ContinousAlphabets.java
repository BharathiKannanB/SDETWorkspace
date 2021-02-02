package week9.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ContinousAlphabets {

	/*  Pseudocode : 
	 * 
	Solution 1: Sliding Window
	 
	Step 1: Initialize variable left and right value
	Step 2: Iterate until input k<0 and right value <= length of input
	Step 3: Inside Loop, If Left != right value, -> decrement the value of k, increment the variable right
	Step 4: If Left == right value, -> increment the variable right
	Step 5: If K =0, -> Increment left and assign k back to original size,  Compare Maxsum 
	
		/* DataSet1: */
		@Test
		public void scenario1() {
			String input = "AABABBA";
			int k=1;
			System.out.println("Output: ");
			System.out.println(ContinousAlphabetsSolution1(input, k));
		}

		/* DataSet2: */
		//@Test
		public void scenario2() {
			String input = "AABBBB";
			int k=1;
			System.out.println("Output: ");
			System.out.println(ContinousAlphabetsSolution1(input, k));
		}

		/* Solution 1: Sliding Window*/

		public int ContinousAlphabetsSolution1(String input1, int k) {
			
			char[] input = input1.toCharArray();
			int right=0;
			int left=0; 
			int size=k;
			int maxsize=0;
			while(right<=input.length-1)
			{
				if(input[right]==0) {
					size--;
					right++;}
				if(input[right]==1)
				{
					if (size>0)
						right++;
					else
					{
						maxsize = Math.max(maxsize, right-left);
						left++;
						size=k;
					}	
				}			
			}
			return maxsize;
			 
			
			
				
		
		}
		
}
		



