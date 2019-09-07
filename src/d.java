import java.util.Scanner;
import java.lang.*;
public class d {

	public static void main(String[] args) {
		Scanner scr= new Scanner (System.in);
		int n=scr.nextInt();
		int res= (int)(Math.log(n)/Math.log(2.0));
		System.out.println(Math.pow (2.0,res));
		int ar[] = new int [n];
		/*for (int i=0;i<n;i++)
		{
			ar[i]=i+1;
		}*/
	//	work(ar);
	}

	public static void work(int ar[]) {
		if (ar.length-1==0) {
			System.out.println(ar[0]);
			return;
		}
		int ans[] = new int[ar.length / 2 ];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 != 0) {
				ans[j] = ar[i];
				j++;
			}
		}
		work(ans);
	}
}