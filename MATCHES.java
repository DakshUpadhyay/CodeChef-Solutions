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
		    int c=a+b;
		    int res = 0;
		    while(c>0){
		        int temp = c%10;
		        if(temp==0 || temp==6 || temp==9)
		            res+=6;
		        else if(temp==1)
		            res+=2;
		        else if(temp==2 || temp==5 || temp==3)
		            res+=5;
		        else if(temp==4)
		            res+=4;
		        else if(temp==7)
		            res+=3;
		        else if(temp==8)
		            res+=7;
		        
		        c=c/10;
		    }
		    System.out.println(res);
		}
	}
}
