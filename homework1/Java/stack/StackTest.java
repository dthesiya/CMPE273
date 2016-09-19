import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
	Stack stack;

	@Before
	public void setUp() throws Exception {
		stack = new Stack(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = StackEmptyException.class)
	public void testPeek() {
		stack.peek();
		stack.push("1");
		stack.push("2");
		assertEquals(stack.peek(), "2");
		stack.push("3");
		assertEquals(stack.peek(), "3");
	}

	@Test(expected = StackEmptyException.class)
	public void testPop() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		assertEquals(stack.pop(), "4");
		assertEquals(stack.pop(), "3");
		assertEquals(stack.pop(), "2");
		assertEquals(stack.pop(), "1");
		stack.pop();
	}

	@Test(expected = StackFullException.class)
	public void testPush() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsFull() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		assertTrue(stack.isFull());
	}

	@Test
	public void testGetSize() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		assertEquals(stack.getSize(), 4);
	}

}
