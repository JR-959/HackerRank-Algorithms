# Java-Algorithms-HackerRank-MySolutions-

The following repository contains my own solutions of the coding challenges
from HackerRank.com/Interviewstreet.com. 

## What is HackerRank?
HackerRank is a place where programmers from all over the world come together to solve problems in a wide range of Computer Science domains such as algorithms, machine learning, or artificial intelligence, as well as to practice different programming paradigms like functional programming.

The subtopics in the repository, such as **Arrays, Implementation, Strings, and etc.** are placed in separate folders. All
the uploaded code has passed all the test cases and produces the correct output

## Sample Challenge 
```
/*
We say that a string,"s" , contains the word hackerrank if a subsequence of the 
characters in "s" spell the word "hackerrank". For example, "haacckkerrannkk" 
does contain "hackerrank", but "haacckkerannk" does not (the characters all appear
in the same order, but it's missing a second "r").
More formally, let p0,p1,p2,...,p9 be the respective indices of h, a, c, k, e, r, r, a, n, k in string "s".
If p0 < p1 < p2< ....< p9 is true, then "s" contains "hackerrank".
You must answer "q" queries, where each query consists of a string, "s". 
For each query, print YES on a new line if contains hackerrank; otherwise, print NO instead.
Input Format:
The first line contains an integer denoting "q" (the number of queries). 
Each line of the "q" subsequent lines contains a single string denoting "s".
Constraints:
2 <= q <= 10^2
10 <= length(s) <= 10^4
Output Format:
For each query, print YES on a new line if s[i] contains "hackerrank";
otherwise, print NO instead.
Sample Input 0:
2
hereiamstackerrank
hackerworld
Sample Output 0:
YES
NO
Explanation 0:
We perform the following  queries:
1. s = h-erei-a-msta-ckerrank
The characters of hackerrank are separated in the string above. Because the string 
contains all the characters in hackerrank in the same exact order as they appear in
hackerrank, we print YES on a new line.
2. s = hacker-wo-r-ld does not contain the last three characters of hackerrank, so we print NO on a new line.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_String {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			
			int j = 0;	//keeps track of the letter index of the word "hackerrank"
			String hackerRank = "hackerrank";
			for (int i = 0; i < s.length(); i++) {
				if (j < hackerRank.length() && s.charAt(i) == hackerRank.charAt(j)) {
					j++;
				}
			}
			
			//checks if all the letters of the word "hackerrank" have occured in the word given
			if (j == hackerRank.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
```


