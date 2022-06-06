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
		    int max=0;
		    for(int i=1; i<=n; i++){
                int gcd = 1, n1=i, n2=n-i;
                for(int j = 1; j <= n1 && j <= n2; ++j) {
                if(n1 %  j== 0 && n2 % j == 0)
                    gcd = j;
                }
                int lcm = (n1 * n2) / gcd;
                if(max<(lcm+gcd))
                    max=lcm+gcd;
		    }
		    System.out.println(max);
		}
	}
}
