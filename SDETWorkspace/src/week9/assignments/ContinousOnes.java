package week9.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ContinousOnes {

	
		/* DataSet1: */
		//@Test
		public void scenario1() {
			int[] input = {1,0,1,0,1,1,0,0,1};
			int k=2;
			System.out.println("Output: ");
			System.out.println(ContinousOnesSolution1(input, k));
		}

		/* DataSet2: */
		@Test
		public void scenario2() {
			int[] input = {1,0,0,1,0,1,1,0,1,1};
			int k=2;
			System.out.println("Output: ");
			System.out.println(ContinousOnesSolution1(input, k));
		}

		/* DataSet3: */
		//@Test
		public void scenario3() {
			int[] input = {1,1,1};
			int k=2;
			System.out.println("Output: ");
			System.out.println(ContinousOnesSolution1(input, k));
		}
		
		/* DataSet4: */
		//@Test
		public void scenario4() {
			int[] input = {0,0,0};
			int k=2;
			System.out.println("Output: ");
			System.out.println(ContinousOnesSolution1(input, k));
		}
		

		/* Solution 1: Sliding Window*/

		public int ContinousOnesSolution1(int[] input, int k) {
			
			int right=0;
			int left=0; 
			int size=k;
			int maxsize=0;
			while(size>0&&right<input.length)
			{
				if(input[right]==0) {
					size--;
					right++;}
				if(input[right]==1)
					right++;
				if(size==0)
				{
					if(maxsize<(right-left))
						{maxsize=right-left;}
					left++;
					size=k;
				}		
			}
			return maxsize;
			
			
			
				
		
		}
		
}
		



