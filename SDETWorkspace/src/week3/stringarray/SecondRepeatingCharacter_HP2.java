package week3.stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;



/*
Problem  :Second Least/Most Repeating Character

Author 	 : BK
Version	 : 1.0
Revision : 
*/

public class SecondRepeatingCharacter_HP2 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "paypal";
		System.out.println("Output: ");
		secondRepeatingCharacterSolution1(input);
	}

	/* DataSet2: */
//	@Test
	public void scenario2() {
		Integer[] input1 = { 1, 2 };
		Integer[] input2 = { 3, 4 };
		System.out.println("Output: ");
//		sortedArraysMedianSolution1(input1, input2);
	}

	/* DataSet3: */
//	@Test
	public void scenario3() {
		Integer[] input1 = { 1, 3, 8, 9, 11 };
		Integer[] input2 = { 2, 6, 7, 10, 12 };
		System.out.println("Output: ");
//		sortedArraysMedianSolution1(input1, input2);
	}

	/* Solution 1: Brute Force */

	public void secondRepeatingCharacterSolution1(String input) {
		
		char[] iparray = input.toCharArray();
		Map<Character,Integer> opmap = new HashMap<Character,Integer>();
		int max,op=0;
		for (char c : iparray) {
			if(opmap.containsKey(c))
				opmap.put(c, opmap.get(c)+1);
			else
				opmap.put(c, 1);
		}
		for(Map.Entry temp: opmap.entrySet())
		{
			max = (int) temp.getValue();
			if(max>op)
			{
			op=max;
			}
		}
		System.out.println("");
		for(Map.Entry temp: opmap.entrySet())
		{
			max = (int) temp.getValue();
			if(max==op)
			{
			System.out.println(temp.getKey());
			}
		}
		
		
	}
	
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < n/2; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 

	/* Solution 2: */

	public void combinationPrimeNumberSolution2(int input) {
		
		int length = (int)(Math.log10(input)+1);
		List<Integer> comblist = new ArrayList<Integer>();
		Set<Integer> output = new HashSet<Integer>();
		int temp=input;
		int comblength,combpower,outputvalue;
		for(int i = length;i>0;i--)
		{
			comblist.add(temp);
			temp=temp/10;
		}		
		//System.out.println(comblist);
			int inc = 0;
			//comblength = (int)(Math.log10(comblist.get(inc))+1);
			for (int j = 0; j < (int)(Math.log10(comblist.get(inc))+1); j++) {
				combpower=(int) Math.pow(10, j+1);
				temp =  (comblist.get(inc)/combpower);
				temp = temp*combpower;
				outputvalue=comblist.get(inc)-temp;
				if(isPrime(outputvalue))
				output.add(outputvalue);
				inc++;
				if(inc>comblist.size())
					break;
			}
			
	
		
		System.out.println("Prime numbers are: "+output);
	}

	// Solution 2 Performance ->

}
