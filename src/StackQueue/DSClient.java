package StackQueue;

public class DSClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack2 s = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			s.push(i * 10);
			s.display();
		}
		while (!s.isempty()) {
			s.pop();
			s.display();

		}

	}

}
