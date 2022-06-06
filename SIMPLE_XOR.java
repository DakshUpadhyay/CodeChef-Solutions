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
		    boolean chk = true;
	        int i=0, j=0, k=0, l=0;
	        outer:
		    for(i=a; i<=b; i++)
		        for(j=i+1; j<=b; j++)
		            for(k=j+1; k<=b; k++)
		                for(l=k+1; l<=b; l++)
		                    if((i^j^k^l)==0){
		                        System.out.println(i+" "+j+" "+k+" "+l);
		                        chk = false;
		                        break outer;
		                    }
		
		    if(chk)
		        System.out.println("-1");
		  
		                        
		}
		
	}
}
