package StackQueue;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());

	}

}
