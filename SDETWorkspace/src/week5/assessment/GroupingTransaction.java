package week5.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupingTransaction {

	public static void main(String[] args) {
		String[] input = {"test", "test","apple","bat","bat"};
		int j=0;
		Map<String, Integer> inputMap = new HashMap<String, Integer>();
		List<String> output = new ArrayList<String>();
		for (String c : input) {
			inputMap.put(c, j);
			j++;
		}
		String x;
		Integer y;
		String z;
		for (Map.Entry<String,Integer> entry : inputMap.entrySet())  
			
            System.out.println("Key = " + entry.getKey().toString() + 
                             ", Value = " + entry.getValue().toString()); 
    } 
		
	}


