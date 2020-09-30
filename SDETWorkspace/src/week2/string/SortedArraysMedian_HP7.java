package week2.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/*
Problem  :Given two sorted arrays A1, A2. Write a code to find median of the arrays

Example 1:

Input:

A1 = [1,3]
A2 = [2]

Output: 2

Example 2:

Input:

A1 = [1,2]
A2 = [3,4]

Output: 2.5

Author 	 : BK
Version	 : 1.0
Revision : 
*/

public class SortedArraysMedian_HP7 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		Integer[] input1 = { 1, 3 };
		Integer[] input2 = { 2 };
		System.out.println("Output: ");
		sortedArraysMedianSolution1(input1, input2);
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		Integer[] input1 = { 1, 2 };
		Integer[] input2 = { 3, 4 };
		System.out.println("Output: ");
		sortedArraysMedianSolution1(input1, input2);
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		Integer[] input1 = { 1, 3, 8, 9, 11 };
		Integer[] input2 = { 2, 6, 7, 10, 12 };
		System.out.println("Output: ");
		sortedArraysMedianSolution1(input1, input2);
	}

	/* Solution 1: Brute Force */

	public void sortedArraysMedianSolution1(Integer[] input1, Integer[] input2) {

		List<Integer> inputlist1 = new ArrayList<Integer>(Arrays.asList(input1));
		List<Integer> inputlist2 = new ArrayList<Integer>(Arrays.asList(input2));
		int position1, position2;
		double finalop;
		inputlist2.addAll(inputlist1);
		Collections.sort(inputlist2);
		System.out.println(inputlist2);
		Object[] output = inputlist2.toArray();
		int oplength = output.length;
		if (oplength % 2 == 1) {
			position1 = oplength / 2;
			System.out.println(output[position1]);
		} else if (oplength % 2 == 0) {
			position1 = oplength / 2;
			position2 = position1 - 1;
			finalop = ((int) output[position1] + (int) output[position2]) / 2.0;
			System.out.println(finalop);
		}

	}

	/* Solution 2: */

	public void sortedArraysMedianSolution2(Integer[] input1, Integer[] input2) {

	}

	// Solution 2 Performance ->

}
