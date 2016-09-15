import java.util.*;

interface QueueInterface<T> {
	void enQueue(T t) throws QueueFullException;

	T deQueue() throws QueueEmptyException;

	boolean isEmpty();

	boolean isFull();

	int getSize();
}

public class Queue<T> implements QueueInterface {
	List<T> queue;
	int size = 0;

	public Queue(int size) {
		this.size = size;
		queue = new ArrayList<T>();
	}

	public void enQueue(Object t) throws QueueFullException {
		if (queue.size() == size) {
			throw new QueueFullException();
		}
		queue.add((T) t);
	}

	public T deQueue() throws QueueEmptyException {
		if (queue.size() == 0) {
			throw new QueueEmptyException();
		}
		return queue.remove(0);
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public boolean isFull() {
		return queue.size() == size;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		Queue<String> queue=new Queue<>(5);
//		try {
			queue.enQueue("1");
			queue.enQueue("2");
			queue.enQueue("3");
			queue.enQueue("4");
			queue.enQueue("5");
			System.out.println(queue.isFull());
			System.out.println(queue.deQueue());
			System.out.println(queue.deQueue());
			System.out.println(queue.deQueue());
			System.out.println(queue.deQueue());
			System.out.println(queue.deQueue());
			System.out.println(queue.isEmpty());
			System.out.println(queue.deQueue());
//		} catch (QueueFullException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (QueueEmptyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

class QueueFullException extends RuntimeException{
	public String toString() {
		return "Cannot add element since Queue is full";
	}
}

class QueueEmptyException extends RuntimeException {
	public String toString() {
		return "Cannot remove element since Queue is empty";
	}
}