package Backtracking;

public class Queenpermustion1d {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		queenpermutation(board, 0, 2, "");
		
	}

	public static void queenpermutation(boolean[] board, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenpermutation(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;
			}
		}
	}

	
}
