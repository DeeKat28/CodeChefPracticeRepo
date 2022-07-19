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
		InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        
        int t = Integer.parseInt(bf.readLine());
        
        while (t-- > 0) {
            String[] strInp = bf.readLine().split(" ");
            int x = Integer.parseInt(strInp[0]);
            int y = Integer.parseInt(strInp[1]);
            
            if (x < y) {
                System.out.println("FIRST");
            } else  if (y < x) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
	}
}
