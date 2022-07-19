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
		int n = sc.nextInt();
		int[] player1 = new int[n];
		int[] player2 = new int[n];
		
		for (int i = 0; i < n; i++) {
		    player1[i] = sc.nextInt();
		    player2[i] = sc.nextInt();
		}
		
		int[] leader = new int[n];
		int[] lead = new int[n];
		int maxLead = 0;
		
		int cummulative1 = 0, cummulative2 = 0;
		for (int i = 0; i < n; i++) {
		    cummulative1 += player1[i];
		    cummulative2 += player2[i];
		    
		    if (cummulative1 > cummulative2) {
		        leader[i] = 1;
		    } else {
		        leader[i] = 2;
		    }
		    
		    lead[i] = Math.abs(cummulative1 - cummulative2);
		    if (lead[i] > lead[maxLead]) {
		        maxLead = i;
		    }
		}
		
		System.out.println(leader[maxLead] + " " + lead[maxLead]);
	}
}
