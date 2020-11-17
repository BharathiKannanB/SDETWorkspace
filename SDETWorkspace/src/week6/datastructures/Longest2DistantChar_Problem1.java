package week6.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
Problem  : Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.

Author 	 : BK
Version	 : 1.3
Revision : 
*/
public class Longest2DistantChar_Problem1 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "eceba";
		System.out.println("Output: ");
		System.out.println(Longest2DistantCharSolution2(input));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		String input = "ccaabbb";
		System.out.println("Output: ");
		System.out.println(Longest2DistantCharSolution2(input));
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		String input = "abcd";
		System.out.println("Output: ");
		System.out.println(Longest2DistantCharSolution2(input));
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		String input = "aaaa";
		System.out.println("Output: ");
		System.out.println(Longest2DistantCharSolution2(input));
	}

	/* Solution 1: Brute Force */

	public int Longest2DistantCharSolution1(String input1) {
		
		char[] inputArray = input1.toCharArray();
		Set<Character> limit = new HashSet<>();
		int arraySize = inputArray.length;
		int output=0;
		for (int i = 0; i < arraySize-1; i++) {
			{
				limit.add(inputArray[i]);
				for (int j = i+1; j < inputArray.length; j++) {
					limit.add(inputArray[j]);
					if(limit.size()>2)
					{
						if(output<j) {
							output=j-1;}
					
					}
				}
			}	
		}	
		return output;
	}
	
	
	/* Solution 2: Sliding Window */

	public int Longest2DistantCharSolution2(String input1) {
		
		char[] inputArray = input1.toCharArray();
		Set<Character> limit = new HashSet<>();
		List<Character> listLimit = new ArrayList<>();
		int arraySize = inputArray.length;
		int output=0;
		for (int i = 0; i < arraySize; i++) {
			{
				limit.add(inputArray[i]);
				listLimit.add(inputArray[i]);
					if(limit.size()>2)
					{
						if(output<listLimit.size()-1) {
							output=listLimit.size()-1;}
						listLimit.remove(0);
						limit.clear();
						limit.addAll(listLimit);
						
					}
				}
			}
		if(limit.size()==2)
			output=listLimit.size();
			
		return output;
	}
}
