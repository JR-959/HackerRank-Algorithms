/*
Sorting 
One common task for computers is to sort data. For example, people might want to see all
their files on a computer sorted by size. Since sorting is a simple problem with many 
different possible solutions, it is often used to introduce the study of algorithms.

Insertion Sort 
These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. 
We will first start with an already sorted list.

Insert element into sorted list 
Given a sorted list with an unsorted number "e" in the rightmost cell, can you write some 
simple code to insert "e" into the array so that it remains sorted?

Print the array every time a value is shifted in the array until the array is fully 
sorted. The goal of this challenge is to follow the correct order of insertion sort.

Guideline: You can copy the value of "e" to a variable and consider its cell "empty". 
Since this leaves an extra cell empty on the right, you can shift everything over until
"V"  can be inserted. This will create a duplicate of each value, but when you reach 
the right spot, you can replace it with .

Input Format 
There will be two lines of input:

 - the size of the array
 - the array containing (size-1) sorted integers and 1 unsorted integer "e" in the rightmost cell
Output Format 
On each line, output the entire array every time an item is shifted in it.

Sample Input

5
2 4 6 8 3
Sample Output

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 

 */


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class InsertionSortPart1 {
	    
	    

	    public static void insertIntoSorted(int[] ar) {
	        // Fill up this function 
	        int lastValue = ar[ar.length-1];
	        for(int i= ar.length-2; i >=0 ;i--)
	        {
	            if(ar[i] > lastValue)
	            {
	                ar[i+1] = ar[i];
	                printArray(ar);
	                
	                ar[i] = lastValue;
	            }
	        }
	             printArray(ar);
	    }
	    
	    
	/* Tail starts here */
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    
	    
	}


