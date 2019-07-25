package StackQueue;

public class DynamicQueue extends Queue2 {

	public DynamicQueue() throws Exception {
		this(defcap);

	}

	public DynamicQueue(int cap) throws Exception {
		super();
	}

	@Override
	public void enqueue(int item) throws Exception {
		if (this.isFull()) {
			int[] arr = new int[2 * this.data.length];
			for (int i = 0; i < this.size; i++) {
				arr[i] = this.data[( this.front+i) % this.data.length];

			}
			this.data = arr;
			this.front = 0;
		}
		super.enqueue(item);
	}

}
