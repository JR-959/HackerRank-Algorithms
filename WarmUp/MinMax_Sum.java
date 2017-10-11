/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range [1,10^9] .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 2+3+4+5 = 14 .
If we sum everything except 2, our sum is 1+3+4+5 = 13.
If we sum everything except 3, our sum is 1+2+4+5 = 12.
If we sum everything except 4, our sum is 1+2+3+5 = 11.
If we sum everything except 5, our sum is 1+2+3+4 = 10.
As you can see, the minimal sum is 10 and the maximal sum is 14. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax_Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextLong();
		}
		long[] sorted = selectionSort(arr);
		long min = sorted[0] + sorted[1] + sorted[2] + sorted[3];
		long max = sorted[4] + sorted[1] + sorted[2] + sorted[3];
		System.out.println(min + " " + max);

	}

	public static long[] selectionSort(long[] a) {
		for (int i = 0; i < a.length; i++) {
			// System.out.println("i: " + i);
			int minimum = i;

			for (int j = i + 1; j < a.length; j++) { // Inner Loop
				// System.out.println("j: " + j);
				if (a[j] < a[minimum]) {
					minimum = j;
				}

			} // end of inner loop

			long temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		} // end of the outer loop

		return a;
	}
}
