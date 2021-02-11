package week12.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
public class StringReduction {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "abab";
		System.out.println("Output: ");
		StringReductionSolution1(input);
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		String input = "abcab";
		System.out.println("Output: ");
		StringReductionSolution1(input);
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		String input = "abcabc";
		System.out.println("Output: ");
		StringReductionSolution1(input);
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		String input = "abc";
		System.out.println("Output: ");
		StringReductionSolution1(input);
	}

	/* Solution 1: Brute Force */

	public void StringReductionSolution1(String input1) {
		char[] input = input1.toCharArray();
		Set<Character> uniqueSet = new HashSet<Character>();
		List<Character> subSequenceList = new ArrayList<Character>();
		for (char c : input) {
			if(uniqueSet.contains(c))
				subSequenceList.add(c);
			else
				uniqueSet.add(c);
		}
			System.out.println(subSequenceList.size());
	}

}
