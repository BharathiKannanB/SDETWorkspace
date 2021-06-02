package week16.problems.revision;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class ValidateBracket {
	
/*

PseudoCode:(BruteForce)

Initialize input character Stack 
Iterate the input array in Loop 1 through i
	If input char i is '(' push the stack ')'
	If input char i is '{' push the stack '}'
	If input char i is '[' push the stack ']'
		 
*/
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		String input = "{[()]}";
		System.out.println("Output: ");
		System.out.println(validateBracket(input));
	}


	/* DataSet2: */
	@Test
	public void scenario2() {
		String input = "{[()}";
		System.out.println("Output: ");
		System.out.println(validateBracket(input));
	}
	
	/* DataSet3: */
	@Test
	public void scenario3() {
		String input = "{}";
		System.out.println("Output: ");
		System.out.println(validateBracket(input));
	}

	/* Solution 1: Brute Force */
     
	private boolean validateBracket(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
		


