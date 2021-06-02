package week16.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class FunWithAnagrams {
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		String[] input = {"code","doce","ecod","framer","frame"};
		System.out.println("Output: ");
		System.out.println(anagramSol(input));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		String[] input = {"code","doce","ecod"};
		System.out.println("Output: ");
		System.out.println(anagramSol(input));
	}
	

	

	/* Solution 1:  */
     
	public List<String> anagramSol(String[] input) {
		Map<String, Integer> tempop = new HashMap<String, Integer>();
		List<String> finalop = new ArrayList<String>();
		String s;
		for (int i = 0; i < input.length; i++) {
		char[] temp = input[i].toCharArray();
		Arrays.sort(temp);
		s=String.valueOf(temp);
		if(!tempop.containsKey(s))
		tempop.put(s, i);
		}
		for(Entry mapele: tempop.entrySet())
		{
			finalop.add(input[(int) mapele.getValue()]);
		}
		Collections.sort(finalop);
		return finalop;		
}

}
