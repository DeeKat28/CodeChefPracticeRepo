/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = bf.readLine().split(" ");
		
		if (
		    in[3].equals(in[0]) 
		    || 
		    in[3].equals(in[1]) 
		    || 
		    in[3].equals(in[2]) 
		    ) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
	}
}
