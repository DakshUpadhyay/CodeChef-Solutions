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
		int test=sc.nextInt();
		
		while(test>0){
		    int x = Integer.parseInt(sc.next());
		    int y = Integer.parseInt(sc.next());
		    if(x<y)
		        System.out.println("FIRST");
		    else if(x>y)
		        System.out.println("SECOND");
		    else if(x==y)
		        System.out.println("ANY");
		        
		    test--;
		}
	}
}
