package week17.problems.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestProgram {
	
/*



PseudoCode:(Two Pointer)

1->Initialize instance, left, right variable,
2->Iterate through loop till left <= right
		  if input value of left not equal to i
		 	Increment 'instance'
		  if input value of left not equal to i
		 	Increment 'instance'
		  Increment left
		  Decrement Right
3-> Print 'instance'

		 
		 
*/
	
	/* DataSet1: */
	@Test
	public void scenario1() {
		int[] ints = {1,2,3,3};
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
		    intList.add(i);
		}
		System.out.println("Output: ");
		System.out.println(rotateArraySol1(intList));
	}


	
   
	
	
	/* Solution 1: Two Pointer 
	 * Time Complexity: O[N/2]
	 * Space Complexity: O[1]
	 */
    
	public int rotateArraySol1(List<Integer> arr) {
		int leftSum=0,rightSum=0, left=0, right=arr.size()-1;
		  leftSum += arr.get(left);
		  rightSum += arr.get(right);
		  left++;
		  right--; 
		    while(left<=right){
		    	System.out.println("leftSum "+leftSum);
		    	System.out.println("RightSum "+rightSum);
		        if(leftSum<rightSum){
		            leftSum += arr.get(left); 
		            left++; 
		            }
		         else if(leftSum>rightSum){
		            rightSum += arr.get(right); 
		            right--;
		            }   
		        else if(leftSum==rightSum){ 
		            return left;}
		    }
		    return -1;
		    }
	
	}
