package week2.string;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  : Rotate an image

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Author 	 : BK
Version	 : 1.2
Revision :  Update 1.0 - Pseudocode Solution 1
			Update 1.1 - Added Solution 1
		    Update 1.2 - Added Pseudocode and code Solution 2
*/

/*  Pseudocode :  Rotate an image

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 
Solution 1: Brute Force 
 
Step 1:	Get the input multidimensional matrix in an array and initialize ouput array
Step 2: Identify input array length and assign to temp variable
Step 3: for( all values 'i' from 0 to row length)
			for(all cell values 0 to column length)
				Swap input cell value and rotated cell location 
Step 4: Print output array

Solution 2: 

Step 1:	Get the input multidimensional matrix in an array
Step 2: Identify input array length and assign to 'n' variable
Step 3: for( all values 'i' from 0 to n/2)
			for(all values 'j' from i to n-i-2)
				Swap all four side values using temp variable 
Step 4: Print output array using Arrays.deepToString

*/

public class RotateMatrix_HP2 {

	/* DataSet1: 3X3 Matrix */
	@Test
	public void scenario1() {
		int[][] input1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Input: ");
		for (int[] row : input1) {
			for (int cell : row) {
				System.out.print(cell);
			}
			System.out.println();
		}
		rotateMatrixSolution2(input1);
	}

	/* DataSet1: 4X4 Matrix */
	@Test
	public void scenario2() {
		int[][] input1 = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 }, { 13, 14, 15, 16 } };

		System.out.println("Input: ");
		for (int[] row : input1) {
			for (int cell : row) {
				System.out.print(cell);
			}
			System.out.println();
		}
		rotateMatrixSolution2(input1);
	}

	/* DataSet1: 2X2 Matrix */
	@Test
	public void scenario3() {
		int[][] input1 = { { 1, 2 }, { 4, 5 } };

		System.out.println("Input: ");
		for (int[] row : input1) {
			for (int cell : row) {
				System.out.print(cell);
			}
			System.out.println();
		}
		rotateMatrixSolution2(input1);
	}

	/* Solution 1: Brute Force */

	public void rotateMatrixSolution1(int[][] input) {
		int[][] output = new int[input.length][input.length];
		int temp = input.length - 1;
		for (int i = 0; i < input.length; i++) {
			int[] row = input[i];
			for (int j = 0; j < row.length; j++) { // O[N^2]
				int cell = row[j];
				output[j][temp] = cell;
			}
			temp--;
		}
		System.out.println("Output: ");
		for (int[] row : output) {
			for (int cell : row) {                  // O[N^2]
				System.out.print(cell);
			}
			System.out.println();
		}
	}
	
	// Solution 2 Performance -> O[N^2]

	/* Solution 2: */

	public void rotateMatrixSolution2(int[][] matrix) {

		 int n=matrix.length;
		    for (int i=0; i<n/2; i++) 
		        for (int j=i; j<n-i-1; j++) {									//O[N X N/2]
		            int tmp=matrix[i][j];
		            matrix[i][j]=matrix[n-j-1][i];
		            matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
		            matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
		            matrix[j][n-i-1]=tmp;
		        }
		    
		    System.out.println("Output : "+Arrays.deepToString(matrix));          //O[?]
		    
//			System.out.println("Output: ");
//			for (int[] row : matrix) {
//				for (int cell : row) {
//					System.out.print(cell);
//				}
//				System.out.println();
//			}
		    
		    }
		
		

	// Solution 2 Performance ->

}
