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
		int maxA=0, maxB=0, a=0, b=0;
		while((test--)>0){
		    a += sc.nextInt();
		    b += sc.nextInt();
		    if((a>b) && (maxA<(a-b))){
		        maxA=a-b;
		    }
		    else if(a<b && maxB<(b-a)){
		        maxB=b-a;
		    }
		}
	    if(maxA>maxB)
	        System.out.print("1 "+maxA);
	    else 
	        System.out.print("2 "+maxB);
	}
}
