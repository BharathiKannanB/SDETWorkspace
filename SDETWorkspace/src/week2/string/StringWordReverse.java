package week2.string;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  : Given a string, you need to reverse the order of characters in each word within a sentence
           while still preserving whitespace and initial word order.
           Input:  "I am doing great"
		   Output: "I ma gniod taerg"
Author 	 : BK
Version	 : 1.0
Revision : 
*/




public class StringWordReverse {
	
	
	/* DataSet1: word length */
	@Test
	public void Scenario1()
	{
		String input = "I am doing great";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));	
	}
	
	/* DataSet2: Starts and ends with space */
	@Test
	public void Scenario2()
	{
		String input = " I am doing great ";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));	
	
	}
	
	/* DataSet3: Palindrome words*/
	@Test
	public void Scenario3()
	{
		String input = "madam anna racecar";					           
		System.out.println("Final output: "+stringWordReverseSolution2(input));		
	}
	
	
	
	/* Solution 1: Brute Force - Inbuilt Function */
	
	public String stringWordReverseSolution1(String input )
	{
		String[] iparray = input.split(" ");
		StringBuilder opstring =  new StringBuilder();
		for(String temp:iparray)
		{
			opstring.append(new StringBuffer(temp).reverse().toString()+" ");
		}
		
		return opstring.toString();
	
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



