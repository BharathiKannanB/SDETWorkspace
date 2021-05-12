package week15.problems.bst;

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
public class IntegerTarget {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int input = 1234567890;
		System.out.println("Output: ");
		NumberConversionSolution1(input);
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int input = 1000000;
		System.out.println("Output: ");
		NumberConversionSolution1(input);
	}



	/* Solution 1: Brute Force */

	public String NumberConversionSolution1(int input) {
		
		
		return "test";
	}

}
