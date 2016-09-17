import static org.junit.Assert.*;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest {
	Generics<Eatables> eatables;
	Generics<Apparels> apparels;

	@Before
	public void setUp() throws Exception {
		eatables = new Generics<>();
		apparels = new Generics<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		eatables.insert(new Eatables("Chips", 150));
		eatables.insert(new Eatables("Bars", 400));
		eatables.insert(new Eatables("Cold Drinks", 250));
		assertTrue(eatables.getSize() == 3);
		apparels.insert(new Apparels("Shirts", 350));
		apparels.insert(new Apparels("Jeans", 800));
		apparels.insert(new Apparels("Skirts", 500));
		assertTrue(apparels.getSize() == 3);
	}

	@Test
	public void testGetList() {
		Eatables e1=new Eatables("Chips", 150);
		Eatables e2=new Eatables("Bars", 400);
		Eatables e3=new Eatables("Cold Drinks", 250);
		eatables.insert(e1);
		eatables.insert(e2);
		eatables.insert(e3);
		List<Eatables> eatableList = eatables.getList();
		assertEquals(eatableList.get(0), e1);
		assertEquals(eatableList.get(2), e3);
		assertEquals(eatableList.get(1), e2);
		Apparels a1 = new Apparels("Shirts", 350);
		Apparels a2 = new Apparels("Jeans", 800);
		Apparels a3 = new Apparels("Skirts", 500);
		apparels.insert(a1);
		apparels.insert(a2);
		apparels.insert(a3);
		List<Apparels> apparelList = apparels.getList();
		assertEquals(apparelList.get(0), a1);
		assertEquals(apparelList.get(2), a3);
		assertEquals(apparelList.get(1), a2);
	}

}
