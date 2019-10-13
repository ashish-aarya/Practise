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
		if (nn==null)
		{
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
		///System.out.println(str);
		display(nn.right);
	}

}
