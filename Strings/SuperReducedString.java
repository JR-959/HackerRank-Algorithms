
/*
  Steve has a string, "s", consisting of "n" lowercase English alphabetic letters.
  In one operation, he can delete any pair of adjacent letters with same value. 
  For example, string "aabcc" would become either "aab" or "bcc" after operation.

  Steve wants to reduce "s" as much as possible. To do this, he will repeat the above 
  operation as many times as it can be performed. Help Steve out by finding and 
  printing "s"'s non-reducible form!

Note: If the final string is empty, print "Empty String" .

Input Format

A single string,"s" .

Constraints
1 <= n <= 100

Output Format

If the final string is empty, print "Empty String"; otherwise, print the final non-reducible string.

Sample Input 0:
aaabccddd

Sample Output 0:
abd

Sample Case 0:

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.

Sample Input 2

aa
Sample Output 2

Empty String
Explanation 2

Steve can perform the following sequence of operations to get the final string:

aa → Empty String
Thus, we print Empty String.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

	static String super_reduced_string(String s) {
		// Complete this function
		String ready = s;
		if (s.length() == 0)
			return "Empty String";
		for (int i = 0; i < s.length(); i++) {
			if (s.length() > i + 1 && s.charAt(i) == s.charAt(i + 1))
				return super_reduced_string(s.substring(0, i) + s.substring(i + 2));
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
