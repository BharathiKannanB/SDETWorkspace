package week10.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MinimumWindow_Dec2_Prob1 {

	/*  Pseudocode : 
	 * 
	Solution 1: Brute Force
	 
	Step 1: Intialize current_freq, max_freq_var and max_freq variable
	Step 2: Add all values from input array into set
	Step 3: Loop 1, Iterate all elements in the set.
	Step 4: Inner Loop 2, Iterate all the elements in the input array
					if i matches j, increment current_freq
					max_freq = max of current_freq and max_freq
					max_freq_var= i				
	Step 4: Print the max_freq and max_freq_var
	
	     
	     Solution 2: Hashing
	 
	Step 1: Intialize,count, max_freq_var and max_freq variable
	Step 2: Initialize HashMap as Integer for both Key and Value			
	Step 3: Loop 1, Iterate all elements in the array.
			 if array element is already present as key
			 			increase its value
			 else add the element as Key with value 1
	Step 4: Loop 2, Iterate through the map
					Identify the maximum value
	Step 5: Print max_freq_var and max_freq
					
	     */
	
	@Test
	public void datasetOne() {
		int[] input = {2,3,4,1,1,7,8};
		repeatingChar_Solution1(input);
	}
	
	@Test
	public void datasetTwo() {
		int[] input = {7,9,4,1,1,7,8};
		repeatingChar_Solution1(input);
	}
	
	public void repeatingChar_Solution1(int[] input)
	{
		 Map<Integer, Integer> ipMap =  new HashMap<Integer, Integer>(); 
		 int element,count, max_v = 0;
		 int max_e=0;
		 for (int i = 0; i < input.length; i++) {
			 element = input[i];
			 if(ipMap.containsKey(element)) {
				 count = ipMap.get(element);
				 ipMap.put(element, count++);} 
				 else
					 ipMap.put(element, 1);
			 for(Entry<Integer, Integer> temp : ipMap.entrySet())             // To identify frequency
		        { 
		            if (max_e < temp.getValue()) 
		            { 
		            	max_v = temp.getKey(); 
		            	max_e = temp.getValue(); 
		            } 
		        } 
			 System.out.println("Maximum count Element and occurace"+max_v +" "+ max_e );
		}
	}
		
}
