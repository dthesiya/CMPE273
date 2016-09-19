import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	Array array;

	@Before
	public void setUp() throws Exception {
		array = new Array(5);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testInsert() {
		array.insert(0, "1");
		array.insert(1, "2");
		array.insert(2, "3");
		array.insert(3, "4");
		array.insert(4, "5");
		array.insert(5, "6");// exception check
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGet() {
		array.get(-6);// exception check
		array.insert(0, "1");
		assertTrue("1".equals(array.get(0)));
		array.insert(1, "2");
		assertTrue("2".equals(array.get(1)));
		array.insert(2, "3");
		assertTrue("3".equals(array.get(2)));
		array.insert(3, "4");
		assertTrue("4".equals(array.get(3)));
		array.insert(4, "5");
		assertTrue("5".equals(array.get(4)));
		array.get(6);// exception check
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testRemove() {
		array.remove(-6);// exception check
		array.insert(0, "1");
		array.insert(1, "2");
		array.insert(2, "3");
		array.insert(3, "4");
		array.insert(4, "5");
		assertTrue("5".equals(array.remove(4)));
		assertTrue(array.remove(4) == null);
		array.remove(6);// exception check
	}

}
