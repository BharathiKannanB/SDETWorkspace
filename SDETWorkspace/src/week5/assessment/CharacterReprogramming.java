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
public class CharacterReprogramming {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "RUDRL";
		System.out.println("Output: ");
		System.out.println(CharacterReprogrammingSolution1(input));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		String input = "RRR";
		System.out.println("Output: ");
		System.out.println(CharacterReprogrammingSolution1(input));
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		String input = "URDR";
		System.out.println("Output: ");
		System.out.println(CharacterReprogrammingSolution1(input));
	}
	
	/* DataSet4: */
	//@Test
	public void scenario4() {
		String input = "abc";
		System.out.println("Output: ");
		System.out.println(CharacterReprogrammingSolution1(input));
	}

	/* Solution 1: Brute Force */

	public int CharacterReprogrammingSolution1(String input1) {
		
		char[] inputArray = input1.toCharArray();
		Map<Integer, Character> inputMap = new HashMap<Integer, Character>();
		int j=0;
		int output=0;
		for (char c : inputArray) {
			inputMap.put(j, c);
			j++;
		}
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int k = i+1; k < inputArray.length; k++) {
				if(inputMap.containsKey(i)&&inputMap.containsKey(k))
				{	
				if((inputArray[i]=='U'&&inputArray[k]=='D')||(inputArray[i]=='D'&&inputArray[k]=='U')||(inputArray[i]=='R'&&inputArray[k]=='L')||(inputArray[i]=='L'&&inputArray[k]=='R')) {
					System.out.println(inputMap);
					inputMap.remove(i);
					inputMap.remove(k);
					output+=2;
					break;
				}			
			}
		}
		
	}
		return output;
	}
}
