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
		    String[] a = sc.next().split("");
		    String[] b = sc.next().split("");
		    String[] str = new String[a.length];
		    for(int i = 0; i<a.length; i++){
		        if(a[i].equals(b[i]))
		            str[i]="G";
		        else
		            str[i]="B";
		    }
		    for(String s: str)
		        System.out.print(s);
		    System.out.println();
		}
	}
}
