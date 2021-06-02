package week16.problems.revision;

import java.util.Scanner;

public class FibonacciSeries_Recursion {
	
	static int fibonacci(int input)
	{
		return input;
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int n = input.nextInt();
		System.out.println(fibonacci(n));
		
	}

}
