package week1.arraysnotations;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  : Find the kth largest element in an unsorted array. 
Note: It is kth largest element in the sorted order, not the kth distinct element.
Input: [3,2,3,1,2,4,5,5,6] and k = 3
Output: 5
Author 	 : BK
Version	 : 1.0
Revision :

*/



public class LargestElementArray {
	
	
	/* DataSet1: Both +ve and -ve values */
	@Test
	public void Scenario1()
	{
		int[] input = {-8,-3,0,1,3,9}; 					           
		System.out.println("Non-decreasing sorted Array "+Arrays.toString(squareAscendingSort3(input)));	
	}
	
	/* DataSet2: Only -ve values */
	@Test
	public void Scenario2()
	{
		int[] input = {-64,-8,-7,-3,-1};        
		System.out.println("Non-decreasing sorted Array "+Arrays.toString(squareAscendingSort3(input)));
	
	}
	
	/* DataSet3: Only +ve values */
	@Test
	public void Scenario3()
	{
		int[] input = {9,9,9,9};
		System.out.println("Non-decreasing sorted Array "+Arrays.toString(squareAscendingSort3(input)));
	}
	
	/* DataSet4: -ve values more than +ve values */
	@Test
	public void Scenario4()
	{
		int[] input = {-8,-3,-2,-1,3,9};
		System.out.println("Non-decreasing sorted Array "+Arrays.toString(squareAscendingSort3(input)));
	}
	
	/* Solution 1: Brute Force - SwapSort */
	
	public int[] squareAscendingSort1(int input[] )
	{
		int[] output = new int[input.length];    	 //O[1]
		int temp=0;		
		for(int value:input)					 	 //O[N]
		{
			value = value*value;               
			output[temp]=value;
			temp++;
		}		
		for (int i = 1; i < output.length; i++) { 	//O[N]
			for (int j = i; j > 0; j--) {        	//O[N^2]
				if (output[j] < output [j - 1]) { 	
					temp = output[j];
					output[j] = output[j - 1];
					output[j - 1] = temp;
				}
			}
		}
		return output;
	}
	
	// Solution 1 Performance  ->   O[1]+ O[N]+ O[N]+ O[N^2] -> O[N^2]
	
	
	
	
	/* Solution 2: Brute Force - ArraySort */
	
	public int[] squareAscendingSort2(int input[])
	{
		int[] output = new int[input.length]; 		//O[1]
		int temp=0;
		for(int value:input)						//O[N]		
		{
			value = value*value;
			output[temp]=value;
			temp++;
		}
		Arrays.sort(output);						//O[N log N]	
		return output;
	}
	
	// Solution 2 Performance  ->   O[1]+ O[N]+ O[N log N] -> O[N log N]
	
	
/* Solution 3: Efficient Method - Divide Positive and Negative Array */
	
	public int[] squareAscendingSort3(int input[])
	{	
		int ipsize =input.length;
		int[] output = new int[ipsize]; 

		if(Integer.signum(input[0])==Integer.signum(input[ipsize-1]))
		{
			if(Integer.signum(input[0])>=0)
			{
				int pos=0;
				for(int i:input)                                                 //O[N]
				{
					output[pos]=i*i;
					pos++;
				}			
			}
			if(Integer.signum(input[0])<0)
			{
				int neg=ipsize-1;
				for(int i:input)												 //O[N]
				{
					output[neg]=i*i;
					neg--;
				}

			}
			return output;	
		}
		else
		{
			int temp=0;
			int poslimit;
			int neglimit;
			int oplimit=0;
			while(temp<ipsize)													//O[N]
			{
				if(input[temp]>=0)
				{
					break;
				}
				temp++;
			}
			poslimit=temp;
			neglimit=temp-1;
			while(neglimit>=0&&poslimit<ipsize)									//O[N]						
			{
				if(input[neglimit]*input[neglimit]<input[poslimit]*input[poslimit])
				{
					output[oplimit]= input[neglimit]*input[neglimit];
					neglimit--;
				}
				else
				{
					output[oplimit]= input[poslimit]*input[poslimit];
					poslimit++;
				}
				oplimit++;
			}	
			while(neglimit>=0)													//O[N]
			{
				output[oplimit]= input[neglimit]*input[neglimit];
				neglimit--;
			}
			while(poslimit<ipsize)												//O[N]
			{
				output[oplimit]= input[poslimit]*input[poslimit];
				poslimit++;
			}		
			return output;
		}

	}
	
	// Solution 3 Performance  ->   O[N]+O[N]+O[N]+O[N]+O[N]+O[N] -> O[N]

}




