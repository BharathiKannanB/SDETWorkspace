package week18.problems.revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class GroupingTransactions {

	@Test
	public void dataSet()
	{
		String[] input = {"apple", "apple", "orange", "orange", "mango"};
		System.out.println(Arrays.toString(groupingTransactionsSol(input)));
	}
	
	
	private String[] groupingTransactionsSol(String[] ip)
	{
		Map<String, Integer> op = new TreeMap<>();
		int j=0;
		for(String i: ip)
			op.put(i, op.getOrDefault(i, 0)+1);
		String[] output = new String[op.size()];
		for (Map.Entry<String, Integer> aa : op.entrySet() ) { 
			output[j]=(aa.getKey()).concat(aa.getValue().toString());
			  System.out.println(output[j]);
			j++;
        } 
		return output;
		
	}
}
