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
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if (k == 0) {
		        int moneySpent = n * Math.min(x,y);
		        System.out.println(moneySpent);
		    } else {
		        int moneySpent = k * x;
    		    moneySpent += (n-k) * Math.min(x,y);
    		    System.out.println(moneySpent);
		    }
		}
	}
}
