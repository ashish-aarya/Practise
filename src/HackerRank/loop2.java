package HackerRank;

import java.util.Scanner;

public class loop2 {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			for (int l1=1;l1<=n;l1++)
			{int sum=0;
				for (int l2=1;l2<=l1;l2++)
				{
					sum+=Math.pow(2, l2-1)*b;
				}
				System.out.print(a+sum+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
