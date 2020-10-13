package week2.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public abstract class TestOddNumbers {



	
	/* Solution 1: Brute Force - SwapSort */
	
	public static void main(String[] args) {
		int values[] = {2,1,5,3,12};
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		int temp=0;
		for (int k : values) {
			if(k%2==0)
				even.add(k);
			else
				odd.add(k);
		}
		even.addAll(odd);
		
		System.out.println(even);
		
			
	
	}
}
	
	
	// Solution 1 Performance  ->   O[1]+ O[N]+ O[N]+ O[N^2] -> O[N^2]


