package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
	Scanner scr = new Scanner(System.in);

	class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public Node construction() {
		return this.root = construction(null, 0);
	}

	private Node construction(Node Parent, int idx) {
		// TODO Auto-generated method stub
		if (Parent == null) {
			System.out.println("Enter the root node data ");

		} else {
			System.out.println("Enter the child of the" + idx + " data ");
		}
		int data = scr.nextInt();
		Node nn = new Node();
		nn.data = data;
		System.out.println("Enter the childs data");
		int noc = scr.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = construction(nn, i);
			nn.children.add(child);
		}

		return nn;
	}

	public void display() {
		System.out.println("----------------");
		display(this.root);
		System.out.println("----------------");
	}

	private void display(Node node) {
		String str = node.data + "->";
		for (Node child : node.children) {
			str += child.data + ",";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children)
			display(child);

	}
}
