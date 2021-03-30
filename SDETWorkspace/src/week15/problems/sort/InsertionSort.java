package week15.problems.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/*
Insertion Sort

*/
public class InsertionSort {
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {1,5,7,1,2};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(insertionSort(input)));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(insertionSort(input)));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {11,4,17,18,2,22,1,8,2,18};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(insertionSort(input)));
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		int[] input = {10,4,2,1};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(insertionSort(input)));
	}

	/* Solution 1: Brute Force */
	public int[] insertionSort(int[] input){   
	        for (int i = 0; i < input.length-1; i++) {
	            if(input[i]>input[i+1]){
	                int temp=input[i];
	                input[i]=input[i+1];
	                input[i+1]=temp;
	            }
	            for (int j =i ; j >=1 && input[j]<input[j-1] ; j--) {
	                    int temp=input[j];
	                    input[j]=input[j-1];
	                    input[j-1]=temp;
	            }       
	        }
	        return input;	        
	    }
}
