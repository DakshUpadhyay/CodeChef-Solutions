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
		    sc.nextLine();
		    String[] str = sc.nextLine().split(" ");
		    int s=0, l=0;
		    for(int i=0; i<a; i++){
		        if(str[i].equals("START38"))
		            s++;
		        else
		            l++;
		    }
		    System.out.println(s+" "+l);
		}
	}
}
