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
		int test= sc.nextInt();
		sc.nextLine();
		while(test>0){
		    String[] str=sc.nextLine().split(" ");
		    int[] data = new int[4];
		    int i=0;
		    for(String s:str){
		        data[i++]=Integer.parseInt(s);
		    }
		    int x = data[0]>data[1]?data[0]:data[1];
		    int y = data[2]>data[3]?data[2]:data[3];
		    if(x<y)
		    System.out.println("P");
		    else if(x>y)
		    System.out.println("Q");
		    else
		    System.out.println("TIE");
		    test--;
		}
	}
}
