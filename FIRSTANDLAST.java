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
		    //System.out.println("a="+a);
		    if(a==2){
		        int first = sc.nextInt();
		        int last = sc.nextInt();
		        System.out.println(first+last);
		    }
		    else{
		        int max=0;
		        int[] arr = new int[a];
		        sc.nextLine();
		        String[] str = sc.nextLine().split(" ");
		        int i = 0;
		        for(String s : str){
		            arr[i++]=Integer.parseInt(s);
		            //System.out.println("b="+arr[i-1]);
		        }
		        max=arr[0]+arr[a-1];
		        //int index=a-1;
		        
		        while(--a>0){
		            //int temp = arr[index-1];
		            //for(i=index-1; i>0; i--)
		                //arr[i]=arr[i-1];
		            //arr[0]=temp;
		            if(max<(arr[a]+arr[a-1]))
		                max=arr[a]+arr[a-1];
		            //a--;
		            //index--;
		        }
		        
		        System.out.println(max);
		    }
		}
	}
}
