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
		    String s = String.valueOf(n);
		    boolean won = true;
		    for (int i = 0; i < s.length(); i++) {
		        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
		            won = false;
		            break;
		        }
		    }
		    if (won) {
		        System.out.println("wins");
		    } else {
		        System.out.println("loses");
		    }
		}
	}
}
