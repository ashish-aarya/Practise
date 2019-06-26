package Basics;

import java.util.Scanner;
public class PatternDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("Term");
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		int sp = 1, nsp = n - 1, st = 1, nst = 1;
		for (int row = 1; row <= 2*n-1; row++) {
			System.out.println("");
			for (sp =1; sp <= nsp; sp++) 
				System.out.print(" ");
			int c=1;
				for (st=1;st<=nst;st++)
				{
					System.out.print(c);
					if (st<=nst/2)
						c++;
					else
						c--;
				}
					if (row<n)
				{
				nst+=2;
				nsp--;
				}
				else 
				{
					nst-=2;
					nsp++;
				}
		}

	}

}