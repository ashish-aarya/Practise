package CodeChef;

import java.util.*;

public class minions {
	public static void main(String[] args)  {
System.out.println("run");
		int t, k, n;
		int ar[];
		Scanner scr = new Scanner(System.in);
		t = scr.nextInt();

		while (t <= 1) {
			n = scr.nextInt();
			k = scr.nextInt();
			ar = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				ar[i] = scr.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				int tem=ar[i]+k;
				if (tem % 7 == 0)
					count++;
			}
			System.out.println(count);
			t--;
		}
	}
}