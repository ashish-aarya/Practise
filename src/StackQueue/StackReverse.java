package StackQueue;

public class StackReverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		for (int i = 1; i <= 5; i++)
			s.push(i * 10);
		s.display();
		Stack help = new Stack(5);
		reversestack(s, help, 0);
		System.out.println();
		s.display();

	}

	public static void reversestack(Stack s, Stack help, int idx) throws Exception {
		// TODO Auto-generated method stub
		if (s.isempty()) {
			return;
		}
		int item = s.pop();
		reversestack(s, help, idx + 1);
		help.push(item);
		if (idx == 0) {
			while (!help.isempty()) {
				s.push(help.pop());
			}
		}

	}

}
