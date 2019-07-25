package StackQueue;

public class Queue2 {
	protected int[] data;
	protected int front;
	protected int size;

	public static final int defcap = 10;

	public Queue2() throws Exception {
		this(defcap);
	}

	public Queue2(int cap) throws Exception {
		if (cap < 1)
			throw new Exception("Invalid Capicity");
		this.data = new int[cap];
		front = 0;
		size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.data.length == 0;
	}

	public boolean isFull() {
		return this.data.length == this.size();
	}

	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("QUEUE is Full");
		}
		int ar = (this.front + this.size) % this.data.length;
		this.data[ar] = item;
		this.size++;

	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("QUEUE is Full");
		}
		int val = this.data[front];
		this.data[front]=0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return val;
	}

	public int getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("QUEUE is Full");
		}
		int val = this.data[front];

		return val;
	}

	public void display() {
		for (int i = 0; i < this.data.length; i++) {
			int ar = ( this.front+i) % this.data.length;
			System.out.print(this.data[ar] + " ");
		}
	}

	// public void test()
	// {
	// front++;
	// size++;
	// }
	// public void display()
	// {
	// System.out.println(front);
	// System.out.println(size);
	// }
}
