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
		    int c = sc.nextInt();
		    if(a>b && b>c || c>b && b>a)
		    System.out.println(b);
		    else if(b>c && c>a || a>c && b<c)
		    System.out.println(c);
		    else
		    System.out.println(a);
		}
	}
}
