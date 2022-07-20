/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    String S = sc.next();
		    String T = sc.next();
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < 5; i++) {
		        if (S.charAt(i) == T.charAt(i)) {
		            sb.append("G");
		        } else {
		            sb.append("B");
		        }
		    }
		    System.out.println(sb.toString());
		}
	}
}
