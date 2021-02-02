package week9.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RepeatedCharacters {

	/*  Pseudocode : 
	 * 
	Solution 1: Brute Force
	 
	Step 1:	Convert the input string into character array
	Step 2: Iterate 'i' through all characters in Loop1 
	Step 3: Iterate through 'j' in Loop2 starting from i+1
	Step 4: Compare value of i and j, If both are equal increment output value, If not break Loop2
	Step 5: Store the max value from comparing output value
	

		/* DataSet1: */
		@Test
		public void scenario1() {
			String input = "AAAAmazonnnn is a great Company AoooZzz";
			System.out.println("Output: ");
			System.out.println(RepeatedCharactersSolution1(input));
		}

		/* DataSet2: */
		@Test
		public void scenario2() {
			String input = "bbb";
			System.out.println("Output: ");
			System.out.println(RepeatedCharactersSolution1(input));
		}

		/* DataSet2: */
		@Test
		public void scenario3() {
			String input = "abc";
			System.out.println("Output: ");
			System.out.println(RepeatedCharactersSolution1(input));
		}
		

		/* Solution 1: Brute Force */

		public int RepeatedCharactersSolution1(String input1) {
			
			char[] inputArray = input1.toCharArray();
			int arraySize = inputArray.length;
			int output=0;
			int max=0;
			for (int i = 0; i < arraySize-1; i++) {
				{
					for (int j = i+1; j < arraySize; j++) {
						if(inputArray[i]!=inputArray[j])
							break;
						else
							max++;
					}
					if(output<max)
						output=max;
					max=0;	
				}	
			}
			
			return output+1;
		}
		
}
		



