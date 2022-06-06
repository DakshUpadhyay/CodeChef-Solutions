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
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while((test--)>0){
		    int n = Integer.parseInt(sc.next());
		    int sum = 2*(180+n);
		    sum = sum - (Integer.parseInt(sc.next())+Integer.parseInt(sc.next()));
		    System.out.println(""+sum);
		}
	}
}
