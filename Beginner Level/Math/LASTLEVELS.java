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
		    int noOfLevels = sc.nextInt();
		    int levelMinutes = sc.nextInt();
		    int breakMinutes = sc.nextInt();
		    
		    int totalMinutes = 0;
		    while (noOfLevels >= 3) {
		        totalMinutes += levelMinutes * 3;
		        noOfLevels -= 3;
		        if (noOfLevels > 0) {
		            totalMinutes += breakMinutes;
		        }
		    }
		    if (noOfLevels > 0) {
		        totalMinutes += levelMinutes * noOfLevels;
		    }
		    System.out.println(totalMinutes);
		}
	}
}
