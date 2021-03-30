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
Bubble Sort

*/
public class BubbleSort {

	

	/* DataSet2: */
	@Test
	public void scenario2() {
		int[] input = {1,5,7,1, 2};
		System.out.println("Output: ");
		System.out.println(bubblesrt(input));
	}



	/* Solution 1: Brute Force */

public int[] bubblesrt(int[] input) {
        
        for(int i=0;i<input.length-1;i++) {
            for(int j=0;j<input.length-1-i;j++) {
                if(input[j]>input[j+1]) {
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
                
            }
        }
        
        return input;
    }

}
