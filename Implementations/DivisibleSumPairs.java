
/*
 You are given an array of "n" integers, [a0,a1,a2,a3,...], and a positive integer, "k". 
 Find and print the number of (i,j) pairs where i<j and  a[i]+ a[j]  is divisible by "k" .

Input Format

The first line contains 2 space-separated integers, "n" and "k", respectively. 
The second line contains "n" space-separated integers describing the respective 
values of [a0 + a1 +a2 + .... + an].

Constraints
2 <= n <= 100
1 <= k <= 100
1 <= a[i] <= 100

Output Format

Print the number of (i,j) pairs where i<j and a[i] + a[j] is evenly divisible by "k".

Sample Input

6 3
1 3 2 6 1 2
Sample Output

 5
Explanation

Here are the  valid pairs:
(0,2) -> 1 + 2 = 3 
(0,5) -> 1 + 2 = 3
(1,3) -> 3 + 6 = 9
(2,4) -> 2 + 1 = 3
(4,5) -> 1 + 2 = 3
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0; // keeps track of the number of pairs divisible by "k"
		
		//loops through the possible combination scenarios
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i != j && i < j) && ((ar[i] + ar[j]) % k) == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
