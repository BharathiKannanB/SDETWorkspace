package week18.problems.revision;

import org.junit.Test;

public class PalindromeSol {

	/* DataSet1:*/
	@Test
	public void scenario1() {
		String s ="abba";
		System.out.println("Output: ");
		palindromeSolution(s);
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		String s ="WATER";
		System.out.println("Output: ");
		palindromeSolution(s);
	}
	
	/* DataSet3: */
	//@Test
	public void scenario3() {
		String s ="a";
		System.out.println("Output: ");
		palindromeSolution(s);
	}

	/* Solution 1: Two Pointer
	 * Time Complexity: O[N/2]
	 * Space Complexity: 
	 */
    
	private boolean palindromeSolution(String s) {
		int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
	}

}
