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
		    int num = sc.nextInt();
		    //System.out.println(num);
		    int[] arrA = new int[num];
		    int[] arrB = new int[num];
		    int[] arrC = new int[num];
		    sc.nextLine();
		    String[] strA = sc.nextLine().split(" ");
		    int i = 0;
		    for(String s : strA){
		        arrA[i++] = Integer.parseInt(s);
		    }
		    String[] strB = sc.nextLine().split(" ");
		    i = 0;
		    for(String s : strB){
		        arrB[i++]=Integer.parseInt(s);
		    }
		    arrC[0]=arrA[0];
		    for(i=1; i<num; i++){
		        arrC[i]=arrA[i]-arrA[i-1];
		        
		    }
		    int res = 0;
		    for(i=0; i<num; i++){
		        //System.out.println(arrC[i]+" "+arrB[i]);
		        if(arrB[i]<=arrC[i])
		        res++;
		    }
		    System.out.println(res);
		}
	}
}
