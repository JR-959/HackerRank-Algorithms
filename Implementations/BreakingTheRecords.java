
/*
Maria plays "n" games of college basketball in a season. Because she wants to go
pro, she tracks her points scored per game sequentially in an array defined 
as s= [s1,s2,s3,.....sn]. After each game , she checks to see if score "s[i]" breaks her record for most
or least points scored so far during that season.

Given Maria's array of scores for a season of "n" games, find and print the number of 
times she breaks her record for most and least points scored during the season.

Note: Assume her records for most and least points at the start of the season 
are the number of points scored during the first game of the season.

Input Format

The first line contains an integer denoting "n" (the number of games). 
The second line contains "n" space-separated integers describing the respective values of [s1,s2,s3,....s] .

Constraints
1 <= n <= 1000
0 <= s[i] <= 10^8

Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

Sample Input 0:
9
10 5 20 20 4 5 2 25 1

Sample Output 0:
2 4

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

	static int[] getRecord(int[] s) {
		// Complete this function
		int highestRecord = s[0]; // updates the newest HIGHEST SCORED record
		int highCount = 0; // keeps track of the number of times the highest record was beaten
		int lowestRecord = s[0]; // updates the newest LOWEST SCORED record
		int lowCount = 0; // keeps track of the number of times the lowest record was beaten

		for (int i = 1; i < s.length; i++) {
			if (s[i] < lowestRecord) {
				lowestRecord = s[i];
				lowCount++;
			}
			if (s[i] > highestRecord) {
				highestRecord = s[i];
				highCount++;
			}
		} // end of loop
		int results[] = { highCount, lowCount };

		return results;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for (Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
	}
}