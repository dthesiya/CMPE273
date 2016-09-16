interface StackInterface {
	Object peek() throws StackEmptyException;

	Object pop() throws StackEmptyException;

	void push(Object obj) throws StackFullException;

	boolean isEmpty();

	boolean isFull();

	int getSize();
}

public class Stack implements StackInterface {
	Object[] stack;
	int size = 0, back = 0;

	public Stack(int size) {
		this.size = size;
		stack = new Object[size];
	}

	public Object peek() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return stack[back - 1];
	}

	public Object pop() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return stack[--back];
	}

	public void push(Object obj) throws StackFullException {
		if (isFull()) {
			throw new StackFullException();
		}
		stack[back++] = obj;
	}

	public boolean isEmpty() {
		return back == 0;
	}

	public boolean isFull() {
		return back == size;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push("1");
		stack.push("2");
		System.out.println(stack.peek());
		stack.push("3");
		stack.push("4");
		stack.push("5");
		System.out.println(stack.isFull());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
	}

}

class StackFullException extends RuntimeException {
	public String toString() {
		return "Cannot add element since Stack is full";
	}
}

class StackEmptyException extends RuntimeException {
	public String toString() {
		return "Cannot remove element since Stack is empty";
	}
}