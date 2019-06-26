package Recursion;

import java.awt.print.Printable;
import java.util.Scanner;

public class RecrsionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);

		 int n = scr.nextInt();
		 System.out.println("Print Decresing");
		 PD(n);
		 System.out.println("Print Increasing");
		 PI(n);
		System.out.println("Print Skipping");
		 PSI(n);
		 
		 System.out.println("factorial: "+Factorial(n));
		 System.out.println("Power"+power(n, 3));
		 //int arr[] = { 1, 2, 3, 4, 5 };
		 int arr[] = { 40, 90, 30, 20, 40, 60 };
		 System.out.println("first index"+firstindex(arr, 0, 40));
		 System.out.println("Last index"+lastindex(arr, 0, 40));
		System.out.println("Print all indeces ");
		 printallindices(arr, 0, 40);
		 System.out.println("ALL indeces");
		 int ar[] = allindices(arr, 0, 40, 0);
		 for (int i = 0; i < ar.length; i++)
		 System.out.print(ar[i] + ",");
		 System.out.println("factorial"+factorial(6));
		System.out.println("Maximum"+maximum(arr, 0));

	}

	public static void PD(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0)
			return;
		PI(n - 1);
		System.out.println(n);

	}

	public static void PSI(int n) {

		if (n == 0)
			return;
		if (n % 2 != 0)
			System.out.println(n);
		PSI(n - 1);
		if (n % 2 == 0)
			System.out.println(n);

	}

	public static int Factorial(int n) {
		if (n == 1)
			return 1;

		int a = Factorial(n - 1);
		int fact = a * n;
		return fact;

	}

	public static int power(int x, int n) {
		if (n == 0)
			return 1;
		int po = power(x, n - 1);
		int val = x * po;
		return val;
	}

	public static int firstindex(int[] arr, int si, int data) {
		if (arr.length == si)
			return -1;
		if (arr[si] == data)
			return si;
		int next = firstindex(arr, si + 1, data);
		return next;
	}

	public static int lastindex(int[] ar, int si, int data) {
		if (ar.length == si)
			return -1;
		int next = lastindex(ar, si + 1, data);
		if (ar[si] == data && next == -1)
			return si;
		return next;
	}

	public static void printallindices(int[] ar, int si, int data) {
		if (si == ar.length)
			return;
		printallindices(ar, si + 1, data);
		if (ar[si] == data)
			System.out.println(si);

		return;

	}

	public static int[] allindices(int[] ar, int si, int data, int count) {
		if (ar.length == si) {
			int br[] = new int[count];
			return br;
		}
		if (ar[si] == data) {
			int res[] = allindices(ar, si + 1, data, count + 1);
			res[count] = si;
			return res;
		} else {
			int res[] = allindices(ar, si + 1, data, count);
			return res;
		}

	}

	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return n;
		int f1 = factorial(n - 1);
		int f2 = factorial(n - 2);
		return f1 + f2;
	}

	public static int maximum(int ar[], int vid) {
		if (ar.length-1 == vid)
			return ar[vid];
		int max = ar[vid];
		max = maximum(ar, vid + 1);
		if (ar[vid] > max)
			max = ar[vid];
		return max;
	}
}
