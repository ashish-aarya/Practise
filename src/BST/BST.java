package BST;

public class BST {

	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int arr[]) {
		root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hig) {
		if (lo > hig) {

			return null;
		}

		Node nn = new Node();
		int mid = (hig + lo) / 2;
		nn.data = arr[mid];
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hig);
		return nn;

	}

	public void display() {
		System.out.println("--------------------------------");
		display(this.root);
		System.out.println("--------------------------------");
	}

	private void display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = " ";
		if (nn.left == null)
			str += '.';
		else
			str += nn.left.data + " ";
		str += " => " + nn.data + " <= ";
		if (nn.right == null)
			str += '.';
		else
			str += " " + nn.right.data;
		System.out.println(str);
		display(nn.left);
		/// System.out.println(str);
		display(nn.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		// TODO Auto-generated method stub
		if (nn == null)
			return false;
		if (nn.data > item) {
			return find(nn.left, item);
		} else if (nn.data < item)
			return find(nn.right, item);

		else
			return true;
	}

	public void ht() {
		System.out.println(ht(this.root));
	}

	private int ht(Node nn) {
		// TODO Auto-generated method stub

		if (nn == null)
			return -1;
		int left = ht(nn.left);
		int right = ht(nn.right);
		return Math.max(left, right) + 1;
	}

	public void max() {
		System.out.println(max(this.root));
	}

	private int max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		int rs = max(nn.right);
		return rs;
	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node nn, int item) {
		if (nn == null)
			return;
		if (nn.data > item) {
			if (nn.left == null) {
				Node n = new Node();
				n.data = item;
				nn.left = n;
			} else
				add(nn.left, item);
		} else if (nn.right == null) {
			Node n = new Node();
			n.data = item;
			nn.right = n;
		} else
			add(nn.right, item);

	}

	private void remove(int item) {
		remove(this.root, null,false, item);
	}

	public int remove(Node node, Node parent, boolean ilc, int item) {
		if (node.data < item) {
			remove(node.right, node, false, item);
		} else if (node.data > item)
			remove(node.left, node, true, item);
		else {
			if (node.left == null && node.right == null) {
				if (ilc)
					node.left = null;
				else
					node.right = null;
			}

		}

	}
}
