package week18.problems.revision;

import org.junit.Test;

public class MidCharacter {

	/* DataSet1:*/
	@Test
	public void scenario1() {
		String s ="WELCOME";
		System.out.println("Output: ");
		starSequenceSol(s);
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		String s ="WATER";
		System.out.println("Output: ");
		subSequenceSol(s);
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		String s ="abc";
		System.out.println("Output: ");
		subSequenceSol(s);
	}

	/* Solution 1: Two Pointer
	 * Time Complexity: O[N]
	 * Space Complexity: 
	 */
    
	private void subSequenceSol(String s) {
		int len = s.length();
		int mid = len/2;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < len-1; i++) 
		{
			output.append(" ");
		}
		for (int i = 0; i < len; i++) {
		output.append(s.charAt(mid));
		System.out.println(output);
		//output.replace(0, 1, "");
		output.deleteCharAt(0);
		mid++;
		if(mid>len-1) mid = 0;
		}
	}
	
	private void starSequenceSol(String s) {
		int len = s.length();
		int mid = len/2;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < len-1; i++) 
		{
			output.append(" ");
		}
		for (int i = 0; i < len; i++) {
		output.append("*");
		System.out.println(output);
		//output.replace(0, 1, "");
		output.deleteCharAt(0);
		mid++;
		if(mid>len-1) mid = 0;
		}
	}

}
