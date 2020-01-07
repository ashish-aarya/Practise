package CodeChef;
import java.util.Scanner;
public class doremon {
	public static void main (String[] args)
	{
		int n,m,t,ans=0,ar[][] = null ;
		Scanner scr= new Scanner (System.in); 
		t=scr.nextInt();
		for (int t1=1;t1<=t;t1++)
		{   ans=0;
			n=scr.nextInt();
			m=scr.nextInt();
			//ans=n*m;
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<m;j++)
					
					ar[i][j]=scr.nextInt();
			 ans = mtrcal (n,m,ar,0,0);
			}
			
		}
	}
public static int mtrcal (int n, int m,int[][] ar,int l,int ans)
{
	
	for (int )
	
	
}

}
