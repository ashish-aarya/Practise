package StackQueue;

public class Stack2 {
//LIFO last in First Out out 40 30 20 10 
	protected int[] data;
	protected int top;
	public static final int def_cap = 10;

	public Stack2() throws Exception {
		this(def_cap);
	}

	public Stack2(int cap) throws Exception {
		if (cap < 1) {
			throw new Exception("Negative Capacity");
		}
		this.data = new int[cap];
		this.top = -1;
	}

	public int size() {
		return this.top + 1;
	}

	public boolean isfull() {
		if (this.data.length == this.size())
			return true;
		return false;
	}

	public boolean isempty() {
		return this.size() == 0;

	}

	public void push(int value) throws Exception {
		if (isfull()) {
			throw new Exception("Stack is full");
		}
		this.top++;
		this.data[this.top] = value;

	}

	public int pop() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is Empty");
		}

		int rv = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rv;
	}

	public int peek() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.data[this.top];
		return rv;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + ",");
			//System.out.println("END");
			
		}
	}

}
