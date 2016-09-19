import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CollectionTest {
	Collection collection;

	@Before
	public void setUp() throws Exception {
		collection = new Collection();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertCar() {
		collection.insertCar(1992, 50000, "Mustang");
		collection.insertCar(1991, 40000, "Shelby");
		collection.insertCar(1993, 80000, "Corvette");
		collection.insertCar(1980, 150000, "Diablo");
		assertTrue(collection.getSize() == 4);
	}

	@Test
	public void testGetSortedByProductionYear() {
		collection.insertCar(1992, 50000, "Mustang");
		collection.insertCar(1991, 40000, "Shelby");
		collection.insertCar(1993, 80000, "Corvette");
		collection.insertCar(1980, 150000, "Diablo");
		List<Car> cars = collection.getSortedByProductionYear();
		for (int i = 1; i < cars.size(); i++) {
			assertTrue(cars.get(i-1).getProductionYear()<cars.get(i).getProductionYear());
		}
	}

	@Test
	public void testGetSortedByPrice() {
		collection.insertCar(1992, 50000, "Mustang");
		collection.insertCar(1991, 40000, "Shelby");
		collection.insertCar(1993, 80000, "Corvette");
		collection.insertCar(1980, 150000, "Diablo");
		List<Car> cars = collection.getSortedByPrice();
		for (int i = 1; i < cars.size(); i++) {
			assertTrue(cars.get(i-1).getPrice()<cars.get(i).getPrice());
		}
	}

}
