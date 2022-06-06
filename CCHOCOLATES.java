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
	    sc.nextLine();
	    while(test>0){
	        String[] str = sc.nextLine().split(" ");
	        int[] data = new int[3];
	        int i=0;
	        for(String s:str){
	            data[i++]=Integer.parseInt(s);
	        }
	        System.out.println(((data[0]*5)+(data[1]*10))/data[2]+"");
	        test--;
	    }
	}
}
