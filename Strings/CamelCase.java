
/*
 Alice wrote a sequence of words in CamelCase as a string of letters, "s", having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given "s", print the number of words in "s" on a new line.

Input Format

A single line containing string "s".

Constraints
1 <= |s| <= 10^5

Output Format

Print the number of words in string "s".

Sample Input:
saveChangesInTheEditor

Sample Output:
5

Explanation:
String  contains five words:

save
Changes
In
The
Editor
Thus, we print  on a new line.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int count = 1; // counts the number of words
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				count++;
		}

		System.out.println(count);
	}
}
