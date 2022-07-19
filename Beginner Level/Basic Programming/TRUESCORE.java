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
        int t = Integer.parseInt(bf.readLine());
		
		while (t-- > 0) {
		    String[] currentScore = bf.readLine().split(" ");
		    int currentScoreA = Integer.parseInt(currentScore[0]);
            int currentScoreB = Integer.parseInt(currentScore[1]);
            String[] newScore = bf.readLine().split(" ");
		    int newScoreC = Integer.parseInt(newScore[0]);
            int newScoreD = Integer.parseInt(newScore[1]);
            
            if (newScoreC >= currentScoreA && newScoreD >= currentScoreB) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
		}
	}
}
