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
	public void ht ()
	{
		System.out.println(ht(this.root));
	}

	private int ht(Node nn) {
		// TODO Auto-generated method stub
		
		if (nn==null)
			return -1;
		int left=ht(nn.left);
		int right=ht(nn.right);
		return Math.max(left, right)+1;
	}
}
