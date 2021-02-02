package week9.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SecondLeast_Ques10 {

	/*  Pseudocode : 
	 
	 */
	
	@Test
	public void datasetOne() {
		String input = "tesla-service";
		System.out.println(secondLeast_Solution1(input));
	}
	
	
	//@Test
	public void datasetTwo() {
		String input = "aabbcccc";
		System.out.println(secondLeast_Solution1(input));
	}
	
	//@Test
	public void datasetThree() {
		String input = "abc";
		System.out.println(secondLeast_Solution1(input));
	}
	
	private char secondLeast_Solution1(String input)
	{	
		char[] ipArray = input.toCharArray();
		Map<Character, Integer> mapInput = new LinkedHashMap<Character, Integer>();
		List<Integer> outputList = new ArrayList<Integer>();
		char output = 0;
		for (char c: ipArray) {
			if (mapInput.containsKey(c)) { 
				mapInput.put(c, mapInput.get(c) + 1); 
			}
            else { 
            	mapInput.put(c, 1); 
            }
		}
		System .out.println(mapInput.get('a'));
            	
           for (Map.Entry m : mapInput.entrySet()) { 
                     System.out.println(m.getKey() + " " + m.getValue()); 
        	   outputList.add( (Integer) m.getValue());
                 } 
           mapInput.get(3);
		
		
	
		
	
		return output;
		
	}
}
