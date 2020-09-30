package week2.string;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  : Rotate an image

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Author 	 : BK
Version	 : 1.0
Revision : 
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
		rotateMatrixSolution1(input1);
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
		rotateMatrixSolution1(input1);
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
		rotateMatrixSolution1(input1);
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
			for (int cell : row) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}

	/* Solution 2: */

	public void rotateMatrixSolution2(int[][] input) {

	}

	// Solution 2 Performance ->

}
