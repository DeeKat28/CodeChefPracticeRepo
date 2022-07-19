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
		
		while (t-- > 0) {
		    String[] strInp = br.readLine().split(" ");
		    int a = Integer.parseInt(strInp[0]);
		    int b = Integer.parseInt(strInp[1]);
		    int c = Integer.parseInt(strInp[2]);
		    
		    if (a + b + c == 180) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}
