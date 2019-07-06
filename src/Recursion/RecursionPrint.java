package Recursion;

public class RecursionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printss("abc", "");
		 printssascii("abc", "");
		 printssper("abc", "");
		 printboardpath(0, 10, "");
		 System.out.println(countboardpath(0, 10));
		 printmazepath(0, 0, 2, 2, "");

		System.out.println(countmazepath(0, 0, 2, 2));
	}

	public static void printss(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, ans);
		printss(ros, ans + ch);
	}

	public static void printssascii(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		printssascii(ros, ans);
		printssascii(ros, ans + ch);
		printssascii(ros, ans + (int) ch);
	}

	public static void printssper(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			{
				char ch = str.charAt(i);
				String ros = str.substring(0, i) + str.substring(i + 1);
				printssper(ros, ans + ch);
			}
		}

	}

	public static void printboardpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			printboardpath(curr + dice, end, ans + dice);
		}
	}

	public static int countboardpath(int curr, int end) {
		if (curr == end) {

			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countboardpath(curr + dice, end);
		}
		return count;
	}

	public static void printmazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printmazepath(cr + 1, cc, er, ec, ans + "H");
		printmazepath(cr, cc + 1, er, ec, ans + "V");
	}

	public static int countmazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += countmazepath(cr + 1, cc, er, ec);
		count += countmazepath(cr, cc + 1, er, ec);
		return count;
	}

}
