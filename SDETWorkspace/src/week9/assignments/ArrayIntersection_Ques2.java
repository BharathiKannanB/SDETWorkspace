package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayIntersection_Ques2 {

	/*  Pseudocode : 
	 * 
	Solution 1: Two Pointer
	 
	Step 1: Initialize two variable 'left1' , 'left2' and output list. 
	Step 2: Sort input1 and input2 array. 
	Step 3: Iterate until left1 < length of array one && left2 < length of array two
		Step 3.1: Inside Loop, If Left1 value of array one == Left2 value array two
		 				->	Add the value to list, Increment Left1 and Left2
		Step 3.2: If Else Left1 value of array one < Left2 value array two
						->  Increment Left1
        Step 3.3:  Else Increment Left2
	Step 4: Convert the output list to Array and print the array     */
	
	@Test
	public void datasetOne() {
		int[] input1 = {11,2,12,1};
		int[] input2 = {2,12};
		System.out.println("Output: ");
		for(int i:arrayIntersection_Solution1(input1, input2)) {	
			System.out.print(" "+i);}
		System.out.println("");
	}
	
	
	@Test
	public void datasetTwo() {
		int[] input1 = {4,9,5,4};
		int[] input2 = {9,4,8,4,7};
		System.out.println("Output: ");
		for(int i:arrayIntersection_Solution1(input1, input2)) {	
			System.out.print(" "+i);}
		System.out.println("");
	}
	
	@Test
	public void datasetThree() {
		int[] input1 = {1,2,3};
		int[] input2 = {9,4,9,8,4};
		System.out.println("Output: ");
		for(int i:arrayIntersection_Solution1(input1, input2)) {	
			System.out.print(" "+i);}
		System.out.println("");
	}
	
	private int[] arrayIntersection_Solution1(int[] input1,int[] input2)
	{	
	int left1=0; 
	int left2=0;
	List<Integer> output = new ArrayList<Integer>();
	Arrays.sort(input1);
	Arrays.sort(input2);
	while(left1<input1.length&&left2<input2.length)
	{
		if(input1[left1]==input2[left2]) {
			output.add(input1[left1]);
			left1++;
			left2++;
		}
		else if(input1[left1]<input2[left2])
			left1++;
		else
			left2++;	
	}
	int[] arr = new int[output.size()];
	for (int i =0; i < output.size(); i++) {
        arr[i] = output.get(i); }
		return arr;	
	}
	
	
	
	
	
	
}
