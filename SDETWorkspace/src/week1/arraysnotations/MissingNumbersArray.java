package week1.arraysnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/*
Problem  : Find all the missing numbers in the given array
Author 	 : BK
Version	 : 1.1
Revision : Update 1.1 - Added Solution 2
*/

/*  Pseudocode : Find all the missing numbers in the given array

Input: [4,3,2,7,8,2,3,1]
Output: [5,6]
 
Solution 1: Brute Force - ArrayComparison
 
Step 1:	Sort the input array using Arrays.sort
Step 2: Construct minimum limit and maximum limit values from the input array
Step 3: for( all values 'i' from min limit to max limit)
			for(all input values j)
				Compare i and j
Step 4: Print empty if no values are missed
Step 5: Else, Print the Missed values

Solution 2: Better Performance - Using Set

Step 1:	Initialize a 'output' HashSet   
Step 2: Sort the input array using Arrays.sort
Step 3: Add all values from first element to last element of input array inside the hashset
Step 4: Remove all values from hashset which are already present in the input array
Step 5: Print empty if no values are missed
Step 6: Print the 'output' Hashset

*/

public class MissingNumbersArray {
	
	
	/* DataSet1: Both +ve and -ve values with duplicates*/
	@Test
	public void Scenario1()
	{
		int[] input = {-3,-8,1,9,3,3}; 	
		missingNumbersSolution1(input);
		System.out.println();
	}
	
	/* DataSet2: Only -ve values */
	@Test
	public void Scenario2()
	{
		int[] input = {-9,-8,-7,-3,-1};        
		missingNumbersSolution1(input);
		System.out.println();
	}
	
	/* DataSet 3: Only +ve values */
	@Test
	public void Scenario3()
	{
		int[] input = {6,2,5,8,0};
		missingNumbersSolution1(input);
		System.out.println();
	}
	
	/* DataSet 4: No missing numbers */
	@Test
	public void Scenario4()
	{
		int[] input = {1,2,3,4,5};
		missingNumbersSolution1(input);
		System.out.println();
	}
	
	/* Solution 1: Brute Force - ArrayComparison */
	
	public void missingNumbersSolution1(int input[] )
	{
		int temp=1;
		
		Arrays.sort(input); 								  //O[N log N]
	
		int nullindicator =0;
		int minlimit = input[0];
		int maxlimit = input[input.length-1];	
		System.out.print("Missing Numbers are : ");
		for(int i=minlimit;i<=maxlimit;i++)                   //O[N]
		{
		for(int j:input)									  //O[N^2]
			{
				if(i==j)
				{	
					temp = 0;
					break;
				}
			}
			if(temp>0)
			{
				System.out.print(i+" ");		
				nullindicator++;
			}
			temp++;
		}
		if(nullindicator==0)
		{
			System.out.print("Empty");
		}
		
	}
	
	// Solution 1 Performance  -> O[N^2]
	
	
	
	/* Solution 2: Better Performance - Using Set*/
	
	public void missingNumbersSolution2(int input[])
	{
		Arrays.sort(input);											 //O[N log N]
	    Set<Integer> set = new HashSet<>();

	    for (int i = input[0]; i < input[input.length - 1]; i++) {   //O[N]
	        set.add(i);
	    }

	    for (int i = 0; i < input.length; i++) {					  //O[N]
	        set.remove(input[i]);
	    }
	    System.out.print("Missing Numbers are : ");	   
	    if(set.isEmpty())
	    {
	    	System.out.print("Empty");
	    }
	    else
	    System.out.print(set + " ");
	}
}
	// Solution 2 Performance  ->   O[N]+ O[N]+ O[N log N] -> O[N log N]
	
	





