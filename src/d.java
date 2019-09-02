import java.util.*;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void work() {
		Scanner scr = new Scanner(System.in);
		// your code goes here
		int tc, ar[], n, k;
		tc = scr.nextInt();
		while (tc > 0) {
			n = scr.nextInt();
			k = scr.nextInt();
			ar = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = scr.nextInt();
			}
			int var = (int) Math.ceil(n / k);
			for (int i = 0; i < n - 2; i++) {
				if (n % var == 0)
					for (int k1 = 0; k1 < n - 1; k1++) {
						int count = 0;
						int sum = 0;

						while (count <= var) {
							if (count == var) {
								sum += ar[k1];
							}

							else {

							}
						}
					}
				tc--;
			}
		}
	}
}
