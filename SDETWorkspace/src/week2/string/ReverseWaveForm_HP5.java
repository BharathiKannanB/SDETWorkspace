package week2.string;

import java.util.Arrays;

import org.junit.Test;

/*
Problem  :Given a matrix, print it in Reverse Wave Form.

Input :  1  2  3  4
         5  6  7  8
         9  10 11 12
         13 14 15 16
		 
Output : 4 8 12 16 15 11 7 3 2 6 10 14 13 9 5 1

Author 	 : BK
Version	 : 1.0
Revision : 
*/

public class ReverseWaveForm_HP5 {

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
		reverseWaveSolution(input1);
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
		reverseWaveSolution(input1);
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
		reverseWaveSolution(input1);
	}

	/* Solution 1: Brute Force */

	public void reverseWaveSolution(int[][] input) {
		int[][] output = new int[input.length][input.length];
		int temp = 0;
		System.out.println("Output :");
		for (int i = input.length - 1; i >= 0; i--) {
			if (temp == 0) {
				while (temp < input.length) {
					System.out.print(input[temp][i]);
					temp++;
				}
				temp--;
			} else {
				while (temp >= 0) {
					System.out.print(input[temp][i]);
					temp--;
				}
				temp++;
			}
		}
	}

	/* Solution 2: */

	public void reverseWaveSolution2(int[][] input) {

	}

	// Solution 2 Performance ->

}
