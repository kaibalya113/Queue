
class Queue{
	int queue[] = new int[6];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = (rear+1)%5;
		size = size+1;
	}
	public void deQueue() {
		int data = queue[front];
		front = (front +1)%5;
		size = size-1;
		System.out.println(data+" is removed.");
	}
	public void display() {
		for(int i =0; i<size; i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
}

public class QueueA {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.deQueue();q.deQueue();q.deQueue();q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.display();
		
	}
}
