import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiThreadingTest {
	MultiThreading multiThreading;

	@Before
	public void setUp() throws Exception {
		multiThreading = new MultiThreading();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecute() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Darshit"));
		students.add(new Student("Vikas"));
		students.add(new Student("Ayush"));
		for (Student student : students) {
			multiThreading.execute(student);
		}
		for (Student student : students) {
			assertTrue(student.getResult().length() > 0);
		}
	}

}
