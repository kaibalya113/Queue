class Node{
	int data;
	Node next;
}
class QueueL{
	Node front;
	Node rear;
	//int front;
	public Node insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}
	public void enQueue(int data) {
		// first check if queue is empty or not
		if(front == null) {
			front = rear = insert(data);
			return;
		}else {
			// if not empty then add value
			rear.next = insert(data);
			rear = rear.next;
				
		}
	}
	public void deQueue() {
		// In this method the First Node will eliminated
		Node node = front;
		front = node.next;
		node = null;
	}
	public void display() {
		Node node = front;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
			
		}
		System.out.println(node.data);
	}
	public int getSize() {
		Node node = front;
		int size =0 ;
		if(node == null) {
			return 0;
		}
		while(node.next != null) {
			size+=1;
			node = node.next ;
		}
		return size;
	}
	public int lastNode() {
		
		return rear.data;
	}
	public int firstNode() {
		
		return front.data;
	}
}
public class QueueLinkedLIst {
	public static void main(String[] args) {
		// Queue is followed FIFO: First in First out
		QueueL q = new QueueL();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		
		//q.deQueue();
		System.out.println("First node: "+q.firstNode());

		System.out.println("Last node: "+q.lastNode());
		System.out.println("Size is: "+q.getSize());
		q.display();
	}
}
