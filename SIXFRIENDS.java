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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if((a*3)>=(b*2))
		        System.out.println(b*2);
		    else if((a*3)<=(b*2))
		        System.out.println(a*3);
		}
	}
}
