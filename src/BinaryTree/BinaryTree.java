package BinaryTree;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class BinaryTree {
	Scanner scr = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node Root;

	public BinaryTree() {
		this.Root = Construct(null, false);
	}

	private Node Construct(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the root/parent node");
		} else {
			if (ilc)
				System.out.println("Enter the data for the left child" + parent.data);
			else
				System.out.println("Enter the data for the right child" + parent.data);

		}
		int item = scr.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println(nn.data + "HAS left Child?");
		boolean blc = scr.nextBoolean();
		if (blc) {
			nn.left = Construct(nn, true);
		}
		System.out.println(nn.data + "HAS right Child?");
		boolean brc = scr.nextBoolean();
		if (brc) {
			nn.left = Construct(nn, false);
		}
		return nn;

	}

	public void display() {
		System.out.println("---------------------");
		display(this.Root);
		System.out.println("---------------------");
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		String str = " ";
		if (node.left == null)
			str += ".";
		else
			str += node.left.data;

		str = "->" + node.data + "<-";

		if (node.right == null)
			str += ".";
		else
			str += node.right.data;
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
}
