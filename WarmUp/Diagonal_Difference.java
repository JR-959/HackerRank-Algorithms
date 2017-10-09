/*
 Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		int diag1 = 0;
		int diag2 = 0;
		int j = a.length - 1;// this variable is used to mark the columns of the diag1
		int k; // this variable is used to mark the columns of the diag2
		for (int i = 0; i < n; i++) {
			k = i;
			diag1 += a[i][k];
			diag2 += a[i][j];
			j--;
		}
		// System.out.println(diag1);
		// System.out.println(diag2);
		System.out.println(Math.abs(diag1 - diag2));
	}
}
