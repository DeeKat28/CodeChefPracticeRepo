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
		    String s = sc.next();
		    
		    int c0 = 0, c1 = 0;
		    for (int i = 0; i < n; i++) {
		        if (s.charAt(i) == '0') {
		            c0++;
		        } else {
		            c1++;
		        }
		    }
		    String res = "";
		    if (c0 <= c1) {
		        for (int i=0;i<c1;i++) {
		            res+='1';
		        }
		    } else {
		        for (int i=0;i<c0;i++) {
		            res+='0';
		        }
		    }
		    System.out.println(res);
		}
	}
	
	public static boolean isPalindrome(String s, int n) {
	    for(int i=0; i<n/2; i++) {
	        if (s.charAt(i) != s.charAt(n - 1 - i))
	            return false;
	    }
	    return true;
	}
}
