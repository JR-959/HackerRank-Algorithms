import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    
        String arr[][] = new String[n][n]; // 2 DIMENSIONAL ARRAY DECLARATION
        
        for(int i=0; i<n; i++)             // ASSIGNES THE ELEMENTS OF ARRAY WETHER TO "#" OR " "(BLANK SPACE)
        {
            int k = 0;
            for(int j=n-1; j >=0; j--)
            {
                if(k<=i)
                {
                    arr[i][j] = "#";
                }
                else
                    arr[i][j] = " ";
        	    k++;	
            }// END OF  INNER LOOP
        }// END OF OUTER LOOP
    
        for(int l=0; l<n; l++)                  //PRINTS OUT THE WHOLE ARRAY
        {
            for(int m=0; m < n; m++)
            {
                System.out.print(arr[l][m]);
            }
            System.out.println();
        }// END OF OUTER LOOP
    }//END OF MAIN
}