package week18.problems.revision;

import org.junit.Test;

public class StringSubsequence {

	/* DataSet1:*/
	@Test
	public void scenario1() {
		String s ="abc";
		String t ="ahbgdc";
		System.out.println("Output: ");
		System.out.println(subSequenceSol(s,t));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		String s ="axc";
		String t ="ahbgdc";
		System.out.println("Output: ");
		System.out.println(subSequenceSol(s,t));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		String s ="acd";
		String t ="ahbgdc";
		System.out.println("Output: ");
		System.out.println(subSequenceSol(s,t));
	}

	/* DataSet4: */
	@Test
	public void scenario4() {
		String s ="abc";
		String t ="abc";
		System.out.println("Output: ");
		System.out.println(subSequenceSol(s,t));
	}
	
	/* DataSet5: */
	@Test
	public void scenario5() {
		String s ="abc";
		String t ="ahbbgdc";
		System.out.println("Output: ");
		System.out.println(subSequenceSol(s,t));
	}

	/* Solution 1: Two Pointer
	 * Time Complexity: O[N]
	 * Space Complexity: 
	 */
    
	private boolean subSequenceSol(String s, String t) {
		char[] sub = s.toCharArray();
		char[] input = t.toCharArray();
		int spointer=0, ipointer=0, count=0;
		if(sub == input)
			return true;
		while(ipointer<input.length){
		if(sub[spointer]==input[ipointer]){
		count++;
		spointer++;
		ipointer++;}
		else ipointer++;}
		return count==sub.length;
	}
	
	
}
