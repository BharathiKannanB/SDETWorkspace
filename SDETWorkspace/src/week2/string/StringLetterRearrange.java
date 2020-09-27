package week2.string;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  : Given a string, check if the letters can be rearranged so that two characters 
           that are adjacent to each other are not the same.
			Input: "aab"
			Output: "aba"
			Input: "aaab"
			Output: ""
Author 	 : BK
Version	 : 1.0
Revision : 
*/




public class StringLetterRearrange {
	
	
	/* DataSet1: Postive Scenario */
	@Test
	public void Scenario1()
	{
		String input = "aab";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));	
	}
	
	/* DataSet2: Negative Scenario */
	@Test
	public void Scenario2()
	{
		String input = " aaab";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));	
	
	}
	
	/* DataSet3: All same letters*/
	@Test
	public void Scenario3()
	{
		String input = "aaa";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));		
	}
	
	/* DataSet4: All different letters*/
	@Test
	public void Scenario4()
	{
		String input = "abcd";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));		
	}
	
	
	
	/* Solution 1: Brute Force - Inbuilt Function */
	
	public String stringWordReverseSolution1(String input )
	{
		char[] iparray = input.toCharArray();
		int ipsize = iparray.length;
		return input;
	
	}
	
	// Solution 1 Performance  ->  O[N^2]
	
	
	
	
	/* Solution 2: Two Pointer Algorithm */
	
	public String stringWordReverseSolution2(String input )
	{
		char[] iparray = input.toCharArray();
		int ipsize = iparray.length;
		int first=0;
		int last=0;
		while(first<ipsize&&last<ipsize)
		{
			while(first<ipsize&&iparray[first]==' ')
			{
				first++;
			}
			last=first;
			while(last<ipsize&&iparray[last]!=' ')
			{
				last++;
			}
			int finalvalue =last-1;
			while(first<finalvalue)
			{
				char c = iparray[first];
				iparray[first]= iparray[finalvalue];
				iparray[finalvalue]=c;
				first++;
				finalvalue--;
			}
			first=last;
			
		}
		
		return new String(iparray);
		
	}
	
	// Solution 2 Performance  ->   O[1]+ O[N]+ O[N log N] -> O[N log N]
	
}



