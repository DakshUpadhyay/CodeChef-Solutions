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
		    int temp = a;
		    int rev = 0;
		    while(temp>0){
		        rev = (rev*10)+temp%10;
		        temp/=10;
		    }
		    if(rev==a)
		    System.out.println("wins");
		    else
		    System.out.println("loses");
		}
	}
}
