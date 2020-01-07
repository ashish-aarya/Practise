package DP;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45;
		System.out.println(fibbo(n));
	 int[] s=new int [n+1];
	 		System.out.println(fibboRS(n, s));

	}

	public static int fibbo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = fibbo(n - 1);
		int f2 = fibbo(n - 2);
		int fib = f1 + f2;
		return fib;
	}

	public static int fibboRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int f1 = fibboRS(n - 1, strg);
		int f2 = fibboRS(n - 2, strg);
		return f1 + f2;
	}
}
