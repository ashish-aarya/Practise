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
		

		return null;
	}

}
