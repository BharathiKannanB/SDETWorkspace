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
Selection Sort

*/
public class SelectionSort {

	
	/* DataSet1: */
	//@Test
	public void scenario1() {
		int[] input = {1,5,7,1,2};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(selectsort(input)));
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(selectsort2(input)));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int[] input = {11,4,17,18,2,22,1,8,2,18};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(selectsort2(input)));
	}
	
	/* DataSet4: */
	@Test
	public void scenario4() {
		int[] input = {10,4,2,1};
		System.out.println("Output: ");
		System.out.println(Arrays.toString(selectsort2(input)));
	}



	/* Solution 1: Brute Force */

public int[] selectsort(int[] input) {
        int min;
        for(int i=0;i<input.length;i++) {
        	min=i;
            for(int j=i+1;j<input.length;j++) {
                if(input[j]<input[min]) {
                	min=j;	
                }       
            }
            int temp=input[i];
            input[i]=input[min];
            input[min]=temp;
        }
        
        return input;
    }

public int[] selectsort2(int[] input) {
    int min;
    for(int i=0;i<input.length;i++) {
    	min=i;
		for (int j = i + 1; j < input.length; j++) {
			if (input[j] > input[min]) {
				min = j;
			}
		}
		int temp = input[i];
		input[i] = input[min];
		input[min] = temp;
	}
    
    return input;
}

}
