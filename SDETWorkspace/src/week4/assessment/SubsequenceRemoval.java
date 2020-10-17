package week4.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/*
Problem  :    Given an array of positive integers, find the minimum length ascending
subsequence such that after removing this subsequence from the
array, the remaining array contains only unique integers. Only one
subsequence will have the minimum length (no ties). If there is no such
subsequence, return [-1].

Example
n = 7
arr = [2, 1, 3, 1, 4, 1, 3]

After removing the subsequence [1, 1, 3], the remaining array of
distinct integers is [2, 3, 4, 1]. The subsequence [1, 1, 3] is the shortest
ascending subsequence with this property, so it is returned.

Author 	 : BK
Version	 : 1.0
Revision : 
*/
public class SubsequenceRemoval {

	/* DataSet1: */
	//@Test
	public void scenario1() {
		Integer[] input = { 2, 1, 3, 1, 4, 1, 3};
		System.out.println("Output: ");
		System.out.println(SubsequenceRemovalSolution1(input));;
	}

	/* DataSet2: */
	//@Test
	public void scenario2() {
		Integer[] input = {1, 1, 1, 3};
		System.out.println("Output: ");
		SubsequenceRemovalSolution1(input);
	}

	/* DataSet3: */
	//@Test
	public void scenario3() {
		Integer[] input = {3, 2, 2, 1, 1};
		System.out.println("Output: ");
		SubsequenceRemovalSolution1(input);
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		Integer[] input = { 5, 3, 2, 2, 1, 1};
		System.out.println("Output: ");
		System.out.println(SubsequenceRemovalSolution1(input));;
	}

	/* Solution 1: Brute Force */

	public List<Integer> SubsequenceRemovalSolution1(Integer[] input1) {
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1 = Arrays.asList(input1);
		int test=0;
		for (int i = 0; i < temp1.size()-1; i++) {
	        if (temp1.get(i)>= temp1.get(i+1))
	            test++;
	    }
		if(test==temp1.size()-1)
		{
			System.out.println(test);
		}
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		List<Integer> subSequenceList = new ArrayList<Integer>();
		for (Integer integer : input1) {
			if(uniqueSet.contains(integer))
				subSequenceList.add(integer);
			else
				uniqueSet.add(integer);
		}
		
		
		subSequenceList.sort(null);
		int temp=0;
		int count=0;
		for (int i = 0; i < subSequenceList.size(); i++) {
			for (int j = temp; j < input1.length; j++) {                   
				if(input1[j]==subSequenceList.get(i))
				{
					count++;
					temp=j+1;
					break;	
				}
			}
		}
	
			return subSequenceList;
	
	}

}
