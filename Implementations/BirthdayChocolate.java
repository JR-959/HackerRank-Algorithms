/*
 Lily has a chocolate bar consisting of a row of "m" squares where each square has 
 an integer written on it. She wants to share it with Ron for his birthday, which
 falls on month "m" and day "d". Lily wants to give Ron a piece of chocolate only if it
 contains "m" consecutive squares whose integers sum to "d".
 
 Given m, n, and the sequence of integers written on each square of Lily's chocolate bar,
 how many different ways can Lily break off a piece of chocolate to give to Ron?

Input Format

The first line contains an integer denoting  "n" (the number of squares in the chocolate bar). 
The second line contains "n" space-separated integers describing the respective values of  
s0,s1,s2,......Sn (the numbers written on each consecutive square of chocolate). 
The third line contains two space-separated integers describing the respective values 
of "d" (Ron's birth day) and "m"(Ron's birth month).

Sample Input 0:
5
1 2 1 3 2 
3 2

Sample Output 0:
2

Sample Input 1:
6
1 1 1 1 1 1
3 2

Sample Output 1:
0

Explanation 1: 
Lily only wants to give Ron 2 consecutive squares of chocolate whose integers sum to 3. 
There are no possible pieces satisfying these constraints.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m) {
		// Complete this function
		int count = 0;
		
		for (int i = 0; i <= n - m; i++) {
			int sum = 0;
			for (int j = i; j < i + m; j++)
				sum += s[j];

			if (sum == d)
				count++;
		}//end of outer for loop

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}//end of main 
}
