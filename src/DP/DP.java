package DP;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibbo (6));

	}
public static  int fibbo (int n)
{
	if (n==0||n==1)
	{
		return n;
	}
int f1= fibbo(n-1);
int f2=fibbo (n-2);
int fib= f1+f2;
return fib;
}
}
