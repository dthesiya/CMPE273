import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue queue;

	@Before
	public void setUp() throws Exception {
		queue = new Queue(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = QueueFullException.class)
	public void testEnQueue() {
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		queue.enQueue("4");
		queue.enQueue("5");
		queue.enQueue("6");
	}

	@Test(expected = QueueEmptyException.class)
	public void testDeQueue() {
		queue.enQueue("1");
		queue.enQueue("2");
		assertEquals(queue.deQueue(), "1");
		assertEquals(queue.deQueue(), "2");
		queue.deQueue();
	}

	@Test
	public void testIsEmpty() {
		assertTrue(queue.isEmpty());
	}

	@Test
	public void testIsFull() {
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		queue.enQueue("4");
		queue.enQueue("5");
		assertTrue(queue.isFull());
	}

	@Test
	public void testGetSize() {
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		assertTrue(queue.getSize() == 3);
	}

}
