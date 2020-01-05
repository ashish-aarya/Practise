package HackerRank;

import java.util.Scanner;

public class eof {
	public static void main(String[] args) {

		Scanner scr= new Scanner (System.in);
		
		int n = scr.nextInt();
		for (int i = 0; i < n; i++) {
			String str = scr.nextLine();
			System.out.println(i+1+" "+str);
		}

	}

}
