package week12.problems;

public class TestVowels {
	
	 public static void main(String args[] ) throws Exception {
		 String line ="aeiaaiooaa";
	        dp = new int[line.length()][vowels.length];
	        for (int i = 0; i < dp.length; i++) 
	            for (int j = 0; j < dp[0].length; ++j)
	                dp[i][j] = -1;
	        System.out.println(recurse(line, 0, 0)); // Print result
	    }
	    static char[] vowels = {'a','e','i','o','u'};
	    static int[][] dp;
	    static int recurse(String s, int idx, int vIdx) {
	        if (vIdx == vowels.length || idx == s.length()) return 0; // Stopping case
	        if (dp[idx][vIdx] != -1) return dp[idx][vIdx]; // Check DP table first
	        int len = 0; // Iterate through substring and pick the longer substring len
	        for (int i = idx; i < s.length(); ++i) { 
	            if (s.charAt(i) == vowels[vIdx]) {
	                len += 1+Math.max(recurse(s, i+1, vIdx), recurse(s, i+1, vIdx+1));
	                break;
	            }
	        }
	        dp[idx][vIdx] = len; // Memoize the result
	        return len;
	    }

}
