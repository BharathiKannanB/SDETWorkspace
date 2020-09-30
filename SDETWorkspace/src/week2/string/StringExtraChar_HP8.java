package week2.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/*
Problem  :Given 2 Strings with length n and (n+1) respectively. The second String contains all the characters of first but with an extra char. Write the code to find the extra char

Example 1:

Input:

A1 = "Test"
A2 = "Test$"

Output: '$'

Example 2:

Input:

A1 = "Hello"
A2 = "lloreH"

Output: 'r'

Author 	 : BK
Version	 : 1.0
Revision : 
*/

public class StringExtraChar_HP8 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input1 = "Test";
		String input2 = "Test$";
		System.out.println("Output: ");
		stringExtraCharSolution1(input1, input2);
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		String input1 = "Hello";
		String input2 = "lloreH";
		System.out.println("Output: ");
		stringExtraCharSolution1(input1, input2);
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		String input1 = "Hello";
		String input2 = "Hello5";
		System.out.println("Output: ");
		stringExtraCharSolution1(input1, input2);
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		String input1 = "Hello";
		String input2 = "Hello";
		System.out.println("Output: ");
		stringExtraCharSolution1(input1, input2);
	}

	/* Solution 1: Inprogress */

	public void stringExtraCharSolution1(String input1, String input2) {

		
		char[] inputone = input1.toCharArray();
		char[] inputtwo = input2.toCharArray();
		List<Character> output = new ArrayList<Character>();
		for(char a:inputtwo)
		{
			output.add(a);
			
		}
		
		
		
		
		
		
		System.out.println(output);
	}

	/* Solution 2: */

	public void stringExtraCharSolution2(String input1, String input2) {
		
		
	}

	// Solution 2 Performance ->

}
