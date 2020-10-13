package week3.stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/*
Problem  :All combinations prime number

Author 	 : BK
Version	 : 1.0
Revision : 
*/

public class CombinationPrimeNumber_HP1 {

	/* DataSet1: */
	@Test
	public void scenario1() {
		int ip = 8713;
		System.out.println("Output: ");
		combinationPrimeNumberSolution1(ip);
	}

	/* DataSet2: */
	@Test
	public void scenario2() {
		int ip = 44;
		System.out.println("Output: ");
		combinationPrimeNumberSolution1(ip);
	}

	/* DataSet3: */
	@Test
	public void scenario3() {
		int ip = 3198305;
		System.out.println("Output: ");
		combinationPrimeNumberSolution1(ip);
	}

	/* Solution 1: Brute Force */

	public void combinationPrimeNumberSolution1(int input) {
		int length = (int)(Math.log10(input)+1);
		List<Integer> comblist = new ArrayList<Integer>();
		Set<Integer> output = new HashSet<Integer>();
		int temp=input;
		int comblength,combpower,outputvalue;
		for(int i = length;i>0;i--)
		{
			comblist.add(temp);
			temp=temp/10;
		}		
		//System.out.println(comblist);
		for (int i = 0; i <comblist.size(); i++) {
			comblength = (int)(Math.log10(comblist.get(i))+1);
			for (int j = 0; j < comblength; j++) {
				combpower=(int) Math.pow(10, j+1);
				temp =  (comblist.get(i)/combpower);
				temp = temp*combpower;
				outputvalue=comblist.get(i)-temp;
				if(isPrime(outputvalue))
				output.add(outputvalue);
			}
			
		}
		System.out.println("Prime numbers are: "+output);
		
	
		

	}
	
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < n/2; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 

	/* Solution 2: */

	public void combinationPrimeNumberSolution2(int input) {
		
		int length = (int)(Math.log10(input)+1);
		List<Integer> comblist = new ArrayList<Integer>();
		Set<Integer> output = new HashSet<Integer>();
		int temp=input;
		int comblength,combpower,outputvalue;
		for(int i = length;i>0;i--)
		{
			comblist.add(temp);
			temp=temp/10;
		}		
		//System.out.println(comblist);
			int inc = 0;
			//comblength = (int)(Math.log10(comblist.get(inc))+1);
			for (int j = 0; j < (int)(Math.log10(comblist.get(inc))+1); j++) {
				combpower=(int) Math.pow(10, j+1);
				temp =  (comblist.get(inc)/combpower);
				temp = temp*combpower;
				outputvalue=comblist.get(inc)-temp;
				if(isPrime(outputvalue))
				output.add(outputvalue);
				inc++;
				if(inc>comblist.size())
					break;
			}
			
		
		System.out.println("Prime numbers are: "+output);
	}

	// Solution 2 Performance ->

}
