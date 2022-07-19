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
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    final String yes = "YES";
	    final String no = "NO";
	    
	    while (t-- > 0) {
	        String[] strInp = br.readLine().split(" ");
	        int X = Integer.parseInt(strInp[0]);
	        int Y = Integer.parseInt(strInp[1]);
	        
	        if (X < Y) {
	            System.out.println(no);
	        } else {
	            System.out.println(yes);
	        }
	    }
	}
}
