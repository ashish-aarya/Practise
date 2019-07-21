package Recursion;

import java.util.ArrayList;

public class RecursionGet {
	public static void main(String[] args) {
		System.out.println(getss("abc"));
//		System.out.println(getssper("abc"));
//
//		System.out.println(boardpath(0, 10));
//		System.out.println(Mazepath(0, 0, 3, 3));
//		System.out.println(Mazepathdig(0, 0, 3, 3));
	}

	public static ArrayList<String> getss(String ss) {
		if (ss.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char cc = ss.charAt(0);
		String ros = ss.substring(1);
		ArrayList<String> res = getss(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : res) {
			mr.add(val);
			mr.add(cc + val);
		}
		return mr;
	}

	public static ArrayList<String> getssper(String ss) {
		if (ss.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = ss.charAt(0);
		String ros = ss.substring(1);
		ArrayList<String> mr = new ArrayList<String>();
		ArrayList<String> rr = getssper(ros);

		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				String ans = val.substring(0, i) + ch + val.substring(i);
				mr.add(ans);
			}
		}
		return mr;
	}

	public static ArrayList<String> boardpath(int start, int end) {
		if (start == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (start > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = boardpath(start + dice, end);
			for (String val : rr)
				mr.add(val + dice);
		}
		return mr;
	}

	public static ArrayList<String> Mazepath(int cc, int cr, int ec, int er) {
		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cc > ec || cr > er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> rec = Mazepath(cc + 1, cr, ec, er);
		for (String val : rec) {
			ans.add("H" + val);
		}
		ArrayList<String> rer = Mazepath(cc, cr + 1, ec, er);
		for (String val : rer) {
			ans.add("V" + val);
		}
		return ans;

	}

	public static ArrayList<String> Mazepathdig(int cc, int cr, int ec, int er) {
		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cc > ec || cr > er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> rec = Mazepathdig(cc + 1, cr, ec, er);
		for (String val : rec) {
			ans.add("H" + val);
		}
		ArrayList<String> rer = Mazepathdig(cc, cr + 1, ec, er);
		for (String val : rer) {
			ans.add("V" + val);
		}
		ArrayList<String> red = Mazepathdig(cc + 1, cr + 1, ec, er);
		for (String val : red) {
			ans.add("D" + val);
		}
		return ans;

	}

}
