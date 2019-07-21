package StackQueue;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("START WAS HERW");
		Queue q=new Queue(5);
		for(int i=1;i<=5;i++)
		q.enqueue(i*10);	
		q.display ();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(60);
		q.display();		
	}

}
