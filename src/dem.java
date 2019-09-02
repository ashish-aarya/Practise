/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dem
{
    
	public static void work () 
	{Scanner scr= new Scanner (System.in);
		// your code goes here
		int tc,ar[],n,k;
		tc=scr.nextInt();
		while (tc>0)
		{
		     n=scr.nextInt();
		     k=scr.nextInt();
		     ar=new int[n];
		     for (int i=0;i<n;i++)
		     {
		        ar[i]=scr.nextInt();
		     }
		     int var=Math.ceil(n/k);
		     for (int i=0;i<n-2;i++)
		     {
		          if (n%ar==0)
		          for (int k=0;k<n)
		          {int count=0;
		          int sum=0;
		          for (int k=0;k<n-1;k++)
		          {
		          while (count)
		          {
		               if (count==var)
		               {
		                    sum+=ar[k];
		               }
		          
		         
		          else
		          {
		               
		          }
		     }
		     }
		     tc--;
		}
		
	}

}
