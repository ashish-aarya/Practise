package Backtracking;

public class QueenCombination {
	static int count;

	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		queencombination(board, 0, 2, "", -1);
	}

	public static void queencombination(boolean[] board, int qpsf, int tq, String ans, int lastcellused) {
		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		for (int i = lastcellused + 1; i < board.length; i++) {
			board[i] = true;
			queencombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
			board[i] = false;
		}
	}
}
