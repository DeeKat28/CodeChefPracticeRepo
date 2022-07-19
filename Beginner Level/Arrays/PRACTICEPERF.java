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
		
		int week = 0;
		for (int i = 0; i < 4; i++) {
		    if (Integer.parseInt(in[i]) >= 10) {
		        week++;
		    }
		}
		System.out.println(week);
	}
}
