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
		
		for (int i = 0; i < t; i++) {
		    
		    char c = br.readLine().charAt(0);
		    
		    switch(c) {
		        case 'b':
		        case 'B':
		            System.out.println("BattleShip");
		            break;
		        case 'c':
		        case 'C':
		            System.out.println("Cruiser");
		            break;
		        case 'd':
		        case 'D':
		            System.out.println("Destroyer");
		            break;
		        case 'f':
		        case 'F':
		            System.out.println("Frigate");
		            break;
		    }
		}
	}
}
