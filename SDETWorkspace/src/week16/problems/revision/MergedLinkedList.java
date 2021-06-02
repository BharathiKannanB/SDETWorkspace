package week16.problems.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class MergedLinkedList {
	
	
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		LinkedList<Integer> input1 = new LinkedList<Integer>();
		input1.add(1);
		input1.add(2);
		input1.add(3);
		input1.add(4);
		LinkedList<Integer> input2 = new LinkedList<Integer>();
		input1.add(5);
		input1.add(6);
		input1.add(7);
		input1.add(8);
		int a = 2;
		int b= 3;
		System.out.println("Output: ");
		System.out.println(MergedSol(input1,input2,a,b));
	}


	

	/* Solution 1: Brute Force */
     
	public LinkedList<Integer> MergedSol(LinkedList<Integer> input1,LinkedList<Integer> input2,int a, int b ) {
		
		for (int i = 0; i < input1.size(); i++) {
			if(input1.get(i)==a)
			{
				input1.addAll(input2);
			}
			
		}
		
		return input1;
				
}

}
