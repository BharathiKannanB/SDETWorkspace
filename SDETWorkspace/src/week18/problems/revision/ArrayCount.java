package week18.problems.revision;

import org.junit.Test;

public class ArrayCount {

	//@Test
	public void dataset() {
		int[] input = {1,1,0,0,1,2,1,3};
		arrayCount(input);
	}
	
	//@Test
	public void dataset1() {
		int[] input = {9,5,9,0,2,2,8,8};
		arrayCount(input);
	}
	
	
	
	public void arrayCount(int input[]) {
	int left=0,right=1,count=1;
		while(left<input.length) {	
			if(input[left]==input[right]) {
				count++;
				if(right==input.length-1)
					System.out.println(input[left]+" - "+count);
				right++;
			}
			if(input[left]!=input[right]) {
				System.out.println(input[left]+" - "+count);
				count=1;
				left=right;
				if(left!=input.length-1) 
				right++;
			}
			if(left==input.length-1)
				System.out.println(input[left]+" - "+count);
		}
	}
	
	//@Test
	public void dataset2() {
		int[] input = {8,8,0,8,0,2,2};
		arrayCount2(input);
	}
	
	@Test
		public void dataset3() {
			int[] input = {8,8,8,8,8,8,1};
			arrayCount2(input);
		}
	
	
	public void arrayCount2(int input[]) {
		int count=1;
		for (int right = 0; right < input.length-1; right++) {
			
			if(input[right]==input[right+1]) {
				count++;
					if(right==input.length-2)
							System.out.println(input[right+1]+" - "+count);}
			else
				{System.out.println(input[right]+" - "+count);
				count=1;
				if(right+1==input.length-1)
					System.out.println(input[right+1]+" - "+count);}
		}
		
		
	}
	
	
	
	
	
}
