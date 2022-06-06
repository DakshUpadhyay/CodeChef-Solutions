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
	    Scanner sc =  new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test>0){
	        String str = sc.next();
	        if(str.contains("4")){
	            int i = str.length()-str.replaceAll("4","").length();
	            System.out.println(i+"");
	        }
	        else
	            System.out.println("0");
	        test--;
	    }
	}
}
