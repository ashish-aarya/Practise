package Recursion;

public class RecursionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printss("abc", "");
		printssascii("abc", "");

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
		for (int i = 0; i < str.length(); i++) {
			{
				char ch = str.charAt(i);
				String ros = str.substring(0, i) + ch + str.substring(i + 1);
				printssper(ros, ans);
			}
		}
	}
}
