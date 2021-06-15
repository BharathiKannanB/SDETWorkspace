package week18.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class ProductSort {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] input = {4,5,6,5,4,3};
		List<Integer> input1 = new ArrayList<>();
		for(int i: input)
			input1.add(i);
		System.out.println("Output: ");
		System.out.println(sortArraySol(input1));
	}

	/* DataSet2: */
	//@Test
	public void scenario2() {
		int[] input = {4,5,6,5,4,3};
		List<Integer> input1 = new ArrayList<>();
		for(int i: input)
			input1.add(i);
		System.out.println("Output: ");
		System.out.println(sortArraySol(input1));
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		int[] input = {4,5,6,5,4,3};
		List<Integer> input1 = new ArrayList<>();
		for(int i: input)
			input1.add(i);
		System.out.println("Output: ");
		System.out.println(sortArraySol(input1));
	}

	
	/* DataSet5: */
	//@Test
	public void scenario5() {
		int[] input = {4,5,6,5,4,3};
		List<Integer> input1 = new ArrayList<>();
		for(int i: input)
			input1.add(i);
		System.out.println("Output: ");
		System.out.println(sortArraySol(input1));
	}
	
	
	/* Solution 1: 
	 * Time Complexity:
	 * Space Complexity:
	 */
    
	public List<Integer> sortArraySol(List<Integer> nums) {
		Map<Integer, Integer> input = new TreeMap<>();
		List<Integer> op = new ArrayList<>();
		for(int i: nums)
			input.put(i, input.getOrDefault(i, 0)+1);
		for(Map.Entry m: input.entrySet())
		{
			op.add((Integer) m.getValue());
		}
		Collections.sort(op);
		System.out.println(op);
		return nums;
	}
	
}
