package BST;

public class BSTCLIENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BST bt=new BST(in);
		bt.display();
		System.out.println(bt.find(20));
		bt.ht();
		bt.max();
		bt.add(5);
		bt.display();
	}

}
