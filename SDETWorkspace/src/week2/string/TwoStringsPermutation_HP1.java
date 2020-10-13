package week2.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
Problem  : 1) Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

Example 1:
Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False

Author 	 : BK
Version	 : 1.0
Revision : 
*/


public class TwoStringsPermutation_HP1 {

	/* DataSet1: Positive scenario */
	@Test
	public void scenario1() {
		String input1 = "eidbaooo";
		String input2 = "ab";
		System.out.println("Output: " + twoStringsPermutationSolution1(input1, input2));
	}

	/* DataSet2: Negative Scenario */
	@Test
	public void scenario2() {
		String input1 = "eidboaoo";
		String input2 = "ab";
		System.out.println("Output: " + twoStringsPermutationSolution1(input1, input2));

	}

	/* DataSet3: Exact value */
	@Test
	public void scenario3() {
		String input1 = "listen";
		String input2 = "listen";
		System.out.println("Output: " + twoStringsPermutationSolution1(input1, input2));
	}

	/* DataSet4: No characters match */
	@Test
	public void scenario4() {
		String input1 = "apple";
		String input2 = "cdf";
		System.out.println("Output: " + twoStringsPermutationSolution1(input1, input2));
	}

	/* DataSet4: No characters match */
	@Test
	public void scenario5() {
		String input1 = "apple";
		String input2 = "applef";
		System.out.println("Output: " + twoStringsPermutationSolution1(input1, input2));
	}

	/* Solution 1: Brute Force*/

	public boolean twoStringsPermutationSolution1(String s2, String s1) {
		char[] charString = s1.toCharArray();
		List<String> output = new ArrayList<String>();
		boolean result = false;

		if (s2.length() < s1.length()) {
			return false;
		}
		
		for (int i = 0; i < charString.length; i++) {
			for (int j = 0; j < charString.length; j++) {                    //  Performance -> O[N^2]
				char temp = charString[i];
				charString[i] = charString[j];
				charString[j] = temp;
				if (!output.contains(String.valueOf(charString))) {
					output.add(String.valueOf(charString));
				}

			}
		}

		

		 if (s2.length() == s1.length() && output.contains(s2)) {
			return true;
		}

		else {
			for (int i = 0; i < (s2.length() - s1.length()) + 1; i++) {
				if (output.contains(s2.substring(i, i + s1.length()))) {
					result = true;
					break;                      // return 
				} else {
					result = false;
				}
			}
		}
		return result;
	}

	/* Solution 2: - Not completed yet*/

	public boolean twoStringsPermutationSolution2(String input1, String input2) {
		char[] iparray1 = input1.toCharArray();
		char[] iparray2 = input2.toCharArray();
		if (iparray1.length < iparray2.length) {
			return false;
		}
		for (char c : iparray2) {
			System.out.print(c);
		}
		for (char c : iparray1) {
			System.out.print(c);
		}
		int j = 0;
		int temp = 0;
		for (int i = 0; i < iparray2.length; i++) {
			while (j < iparray1.length) {
				if (iparray2[i] == iparray2[j]) {
					temp++;
					j++;
					break;
				}
			}
		}
		if (temp == iparray2.length)
			return true;
		else
			return false;

	}

	// Solution 2 Performance ->

}
