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
		    int res=0;
		    int a = sc.nextInt();
		    //System.out.println("a="+a);
		    if(a==1){
		        sc.nextLine();
		        sc.nextLine();
		        System.out.println(a);
		    }
		    
		    else{
		        sc.nextLine();
		        String[] b = sc.nextLine().split(" ");
		        res=b.length;
		        for(int i=1; i<b.length; i++){
		            //System.out.println("b="+b[i]);
		            if(b[i].equals(b[i-1])){
		                res--;
		            }
		        }
		        System.out.println(res);
		    }
		}
	}
}
