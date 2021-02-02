package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PatternMatch_Ques8 {

	/*  Pseudocode : 
	 * 
	Solution 1: 
	 
	Step 1: Convert input string into character array
	Step 2: Compare string length and pattern length, return false if it didnt match .
	Step 3: Iterate through String array
					
	Step 4: Print the result     */
	
	@Test
	public void datasetOne() {
		String pattern = "abba";
		String input = "dog cat cat dog";
		System.out.println(firstDuplicate_Solution1(pattern, input));
	}
	
	@Test
	public void datasetTwo() {
		String pattern = "abc";
		String input = "hello world world";
		System.out.println(firstDuplicate_Solution1(pattern, input));
	}
	

	
	
	
	
	
	private boolean firstDuplicate_Solution1(String Pattern, String input)
	{
		
		String[] inputArr = input.split(" ");
	    if (inputArr.length != Pattern.length())
	        return false;
		
	    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
	    HashMap<String, Integer> stringMap = new HashMap<String, Integer>();
	    
	   for (String string : inputArr) {
		//   charMap.put(key, value)
	}
	    
		return false;
		
		
		
	}
		
}
