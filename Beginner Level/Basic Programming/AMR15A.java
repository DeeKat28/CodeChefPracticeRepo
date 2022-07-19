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
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] strInp = bf.readLine().split(" ");
		
		int lucky = 0, unlucky = 0;
		
		for(int i = 0; i < n;  i++) {
		    if (Integer.parseInt(strInp[i]) % 2 == 0) {
		        lucky++;
		    } else {
		        unlucky++;
		    }
		}
		
		if (lucky > unlucky) {
		    System.out.println("READY FOR BATTLE");
		} else {
		    System.out.println("NOT READY");
		}
	}
}
