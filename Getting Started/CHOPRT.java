/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
		    //int A = sc.nextInt();
		    //int B = sc.nextInt();
		    
		    String[] strInp = br.readLine().split(" ");
		    int A = Integer.parseInt(strInp[0]);
		    int B = Integer.parseInt(strInp[1]);
		    
		    if (A < B)
		        System.out.println("<");
		    else if (A > B)
		        System.out.println(">");
		    else
		        System.out.println("=");
		}
	}
}
