/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    int n = sc.nextInt();
		    int[] frames = new int[n];
		    for (int i=0;i<n;i++) {
		        frames[i] = sc.nextInt();
		    }
		    
		    int minFrames = n;
		    
		    for (int i = 0; i < n - 1; i++) {
		        if (frames[i] == frames[i+1]) {
		            minFrames--;
		        }
		    }
		    System.out.println(minFrames);
		}
	}
}