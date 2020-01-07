package DP;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
//		System.out.println(fibbo(n));
	int[] s = new int[n + 1];
//		System.out.println(fibboRS(n, s));
//		System.out.println(fiboir(n, s));
		System.out.println(cbp(0, n));
		System.out.println(cbprs(0, n, s));
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

	public static int fiboir(int n, int[] strg) {
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}
	public static int cbp (int curr, int end )
	{
		if (curr==end)
			return 1;
		if (curr>end)
			return 0;
		int count=0;
		for (int i=1;i<=6;i++)
		{
			 count=count+cbp(curr+i, end);	
		}
	return count;
	}
	public static int cbprs (int curr, int end , int [] strg)
	{
		if (curr==end)
			return 1;
		if (curr>end)
			return 0;
		
		int count=0;
		if (strg[curr]!=0)
			return strg[curr];
			
		for (int i=1;i<=6;i++)
		{
			 count=count+cbprs(curr+i, end,strg);	
		}
		strg[curr]=count;
	return count;
	}
	
}
