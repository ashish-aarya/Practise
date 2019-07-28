package LinkedList;
public class LinkedList {

	private class node
	{
		int data;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	
	public  void display ()
	{
		node temp=this.head;
		while (temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
