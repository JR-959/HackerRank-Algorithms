
/*
This is a simple challenge to get things started. Given a sorted array (ar) and a number
(V), can you print the index location of "V" in the array?

The next section describes the input format. You can often skip it, if you are using 
included methods.

Input Format: 
There will be three lines of input:

 "V" - the value that has to be searched.
 "n" - the size of the array.
 ar - n  numbers that make up the array.
 
Output Format: 
Output the index of "V" in the array.

The next section describes the constraints and ranges of the input. You should check this
section to know the range of the input.

Constraints
1 <= n <= 1000
-1000 <= V <= 1000, 
It is guaranteed that "V" will occur in array exactly once

It is guaranteed that  will occur in  exactly once.
This "sample" shows the first input test case. It is often useful to go through the sample to understand a challenge.

Sample Input:
4
6
1 4 5 7 9 12

Sample Output:
1

Explanation: 
V = 4. The value 4 is the 2nd element in the array, but its index is 1 since array indices start from 0, so the answer is 1.
 */

import java.io.*;
import java.util.*;

public class IntrChallenge {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int size = scan.nextInt();
		int arr[] = new int[size];
		// Fill out the array
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] == v)
				System.out.println(i);
		}

	}
}
