package LinkedList;

public class LinkedList {

	private class node {
		int data;
		node next;
	}

	private node head;
	private node tail;
	private int size;

	public void display() {
		node temp = this.head;
		System.out.println("------------------");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("------------------");
	}

	public void addlast(int item) {
		node nn = new node();
		nn.data = item;
		nn.next = null;
		if (this.size >= 1) {
			this.tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		nn.next = null;
		if (size >= 1) {
			nn.next = this.head;
		}
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		return this.head.data;

	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is Empty");
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (idx == 0)
			throw new Exception("Linked List Empty");
		if (idx < 0 || idx >= this.size)
			throw new Exception("Invalid Index");
		node temp = this.head;
		 for (int i=0;i<idx;i++)
		 {
			 temp=temp.next;
		 }
		 return temp.data;
	}
	private node getNodeAt(int idx) throws Exception {
		if (idx == 0)
			throw new Exception("Linked List Empty");
		if (idx < 0 || idx >= this.size)
			throw new Exception("Invalid Index");
		node temp = this.head;
		 for (int i=0;i<idx;i++)
		 {
			 temp=temp.next;
		 }
		 return temp;
	}
}
