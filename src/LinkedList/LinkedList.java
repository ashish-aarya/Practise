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
		if (this.size == 0)
			throw new Exception("Linked List Empty");
		if (idx < 0 || idx > this.size)
			throw new Exception("Invalid Index");
		node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private node getNodeAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("Linked List Empty");
		if (idx < 0 || idx > this.size)
			throw new Exception("Invalid Index");
		node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, int item) throws Exception {
		if (idx < 0 || idx > this.size)
			throw new Exception("Invalid Index");
		if (idx == 0)
			addfirst(item);
		else if (idx == this.size)
			addlast(item);
		else {
			node nn = new node();
			nn.data = item;
			nn.next = null;
			node nm = getNodeAt(idx - 1);
			node nm1 = nm.next;
			nm.next = nn;
			nn.next = nm1;
			this.size++;

		}
	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public int removelast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is Empty");
		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;

		} else {
			node las = getNodeAt(this.size - 2);
			las.next = null;
			this.tail = las;
			this.size--;
		}
		return rv;
	}

	public int removeat(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("Linked List is Empty");
		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index");
		}
		if (idx == 0) {
			return removefirst();
		} else if (idx == this.size - 1) {
			return removelast();
		} else {
			node cp = getNodeAt(idx - 1);
			node c = cp.next;
			node ln = c.next;
			this.size--;
			return c.data;
		}

	}

	public void reversedataIrtritevely() throws Exception {
		if (this.size == 0)
			throw new Exception("Empty Linked List");
		int start = 0;
		int end = this.size;
		while (start < end) {
			node left = getNodeAt(start);
			node right = getNodeAt(end);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			start++;
			end--;

		}

	}

	public void reversepointerIrtretively() {

	}
}
