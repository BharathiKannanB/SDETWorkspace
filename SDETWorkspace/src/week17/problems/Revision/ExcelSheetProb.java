package week17.problems.Revision;

import org.junit.Test;

public class ExcelSheetProb {
	/* DataSet1: */
	@Test
	public void scenario1() {
		int k=5;
		System.out.println("Output: ");
		System.out.println(ExcelSheetProbSol1(k));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		int k=26;
		System.out.println("Output: ");
		System.out.println(ExcelSheetProbSol1(k));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		int k=705;
		System.out.println("Output: ");
		System.out.println(ExcelSheetProbSol1(k));
	}

	/* Solution 1: Brute Force 
	 * Time Complexity: O[N]
	 * Space Complexity: O[1]
	 */
   
	public StringBuilder ExcelSheetProbSol1(int k) { 
			StringBuilder op=new StringBuilder();
	        String alpa[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	        while(k>0)
	        { 
	            if(k%26==0)
	            	op.append(alpa[25]);
	            else
	            	op.append(alpa[k%26-1]);
	            k=(k-1)/26;
	        }
	        return op.reverse();
	}
}
