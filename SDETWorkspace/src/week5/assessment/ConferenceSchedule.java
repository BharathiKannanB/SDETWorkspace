package week5.assessment;

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
Problem  :    Given a string, reduce it in such a way that all of its substrings are
distinct. To do so, you may delete any characters at any index. What is
the minimum number of deletions needed?

Example
s = "abab"

Substrings in s are { 'a', 'b', 'a', 'b', 'ab', 'ba', 'ab', 'aba', 'bab', 'abab'}. By
deleting one "a" and one "b", the string becomes "ab" or "ba" and all of
its substrings are distinct. This required 2 deletions.

Author 	 : BK
Version	 : 1.0
Revision : 
*/
public class ConferenceSchedule {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input1 = {1,1,2};
		int[] input2 = {3,2,4};
		System.out.println("Output: ");
		System.out.println(ConferenceScheduleSolution1(input1, input2));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input1 = {1, 1, 2, 3};
		int[] input2 = {2, 3, 3, 4};
		System.out.println("Output: ");
		System.out.println(ConferenceScheduleSolution1(input1, input2));
	}

	/* DataSet3: */
	//@Test
	public void scenario3() {
		int[] input1 = {6, 1, 2, 3};
		int[] input2 = {8, 9, 4, 7};
		System.out.println("Output: ");
		System.out.println(ConferenceScheduleSolution1(input1, input2));
	}
	
	/* DataSet4: */
	//@Test
	public void scenario4() {
		String input = "abc";
		System.out.println("Output: ");
	//	System.out.println(CharacterReprogrammingSolution1(input));
	}

	/* Solution 1: Brute Force */

	public int ConferenceScheduleSolution1(int[] input1, int[] input2) {
		
	int output=1;
	for (int i = 0; i < input2.length; i++) {
		for (int j = i+1; j < input1.length; j++) {
			if(input2[i]<=input1[j])
			{
				
				System.out.println("i "+input2[i]+" j "+input1[j]);
				output++;
			}
			
		}
		
	}
	return output;
	
	}
}
