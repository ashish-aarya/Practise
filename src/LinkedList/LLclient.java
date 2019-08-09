package LinkedList;

public class LLclient {
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.display();
		ll.addfirst(50);
		ll.addlast(70);
		ll.addfirst(60);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getAt(3));
		ll.addAt(2, 80);
		ll.display();
		System.out.println(ll.removefirst());
		ll.display();
		System.out.println(ll.removelast());
		ll.display();
		System.out.println(ll.removeat(1));
		ll.display();
		ll.removefirst();
		ll.display();
		ll.reversedataIrtritevely();
		ll.display();
	}

}
