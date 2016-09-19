interface QueueInterface {
	void enQueue(Object obj) throws QueueFullException;

	Object deQueue() throws QueueEmptyException;

	boolean isEmpty();

	boolean isFull();

	int getSize();
}

public class Queue implements QueueInterface {
	Object[] queue;
	int size = 0, back = 0;

	public Queue(int size) {
		this.size = size;
		queue = new Object[size];
	}

	public void enQueue(Object obj) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException();
		}
		queue[back++] = obj;
	}

	public Object deQueue() throws QueueEmptyException {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		Object result = queue[0];
		for (int i = 0; i < back - 1; i++) {
			queue[i] = queue[i + 1];
		}
		back--;
		return result;
	}

	public boolean isEmpty() {
		return back == 0;
	}

	public boolean isFull() {
		return back == size;
	}

	public int getSize() {
		return back;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		// try {
		queue.enQueue("Print book1");
		queue.enQueue("Print paper");
		queue.enQueue("Print articles");
		queue.enQueue("Print news");
		queue.enQueue("Print notes");
		System.out.println(queue.isFull());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.isEmpty());
		System.out.println(queue.deQueue());
		// } catch (QueueFullException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }catch (QueueEmptyException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}

class QueueFullException extends RuntimeException {
	public String toString() {
		return "Cannot add element since Queue is full";
	}
}

class QueueEmptyException extends RuntimeException {
	public String toString() {
		return "Cannot remove element since Queue is empty";
	}
}