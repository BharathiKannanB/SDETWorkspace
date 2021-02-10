package week17.problems.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestProgram2 {
	
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
		int[] ints = {1,1,3,4};
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
    
	public List<Integer> rotateArraySol1(List<Integer> lengths) {
		 List<Integer> output = new ArrayList<>();
		    int cut,temp;
		    Collections.sort(lengths);
		    cut=lengths.get(0);
		    output.add(lengths.size());
		    while(!lengths.isEmpty())
		    {
		      for (int i = 0; i < lengths.size(); i++) {
		          if(lengths.get(i)==cut){
		        	  System.out.println(lengths.get(i));
		              lengths.remove(i);
		          }
		          else {
		        	  System.out.println(lengths.get(i));
		        	  temp = lengths.get(i);
		        	  lengths.set(i, temp-cut);
		        	  
		        	  //lengths.add(i, lengths.get(i)-cut);   
		          }
		          }
			  cut=lengths.get(0);
		      if(!lengths.isEmpty()) {
		      output.add(lengths.size());}
		      }  
		    return output;
		    }
	
	
	 public static List<Integer> rodOffcut(List<Integer> lengths) {
		    // Write your code here
		        List<Integer> output = new ArrayList<>();
		        int[] array = new int[lengths.size()]; 
		  
		        // ArrayList to Array Conversion 
		        for (int i =0; i < lengths.size(); i++) 
		            array[i] = lengths.get(i);
		            
		        Arrays.sort(array);
		        output.add(array.length);
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] != array[i-1]) {
		                output.add(array.length - i);
		            }    
		        }   
		       return output; 
		    }
	}
