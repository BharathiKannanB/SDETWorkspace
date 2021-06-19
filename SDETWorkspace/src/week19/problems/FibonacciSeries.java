package week19.problems;

import java.util.Arrays;

import org.junit.Test;

public class FibonacciSeries {

	@Test
	public void testdata() {
		int input = 5;
		System.out.println(Arrays.toString(fibonacciSeriesProdSol(input)));
	}

	private int[] fibonacciSeriesProdSol(int input) {
	
		int[] output = new int[input];
		output[0]=1;
		output[1]=1;
		// Fibonacci series
		for (int i = 2; i < input; i++) {
			output[i]=output[i-1]+output[i-2];
		}
		
		// Product of Fibonacci series
		for (int i = 1; i < input; i++) {
			output[i] = output[i - 1] * output[i];	
		}
		
		return output;
	}
	
	
    
  

}
