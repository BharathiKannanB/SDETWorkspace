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
Problem  : Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.

Author 	 : BK
Version	 : 1.0
Revision : 
*/
public class StringReverseWord_Problem3 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "Let's take LeetCode contest";
		System.out.println("Output: ");
		System.out.println(StringReverseWordSolution1(input));
	}

	/* DataSet2: */
	//@Test
	public void scenario2() {
		String input = " apple ";
		System.out.println("Output: ");
		System.out.println(StringReverseWordSolution2(input));
	}

	/* DataSet3: */
	//@Test
	public void scenario3() {
		String input = "a b c d";
		System.out.println("Output: ");
		System.out.println(StringReverseWordSolution2(input));
	}
	
	/* DataSet4: */
	//@Test
	public void scenario4() {
		String input = "orange";
		System.out.println("Output: ");
		System.out.println(StringReverseWordSolution2(input));
	}

	/* Solution 1: Brute Force */

	public String StringReverseWordSolution1(String input) {
		String[] iparray = input.split(" ");
		char[] reverseip;
		char[] reverseop;
		int k=0;
		String output = null;
		for (int i = 0; i < iparray.length; i++) {
			reverseip=iparray[i].toCharArray();
			for (int j = reverseip.length-1; j >=0 ; j--) {
				// = new char[reverseip.length];
				reverseop[k]=reverseip[j];
				k++;
			}
			k=0;
		}
		
		
		return output;
	}
	
	
	/* Solution 2: */

	public int StringReverseWordSolution2(String input1) {
		
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
