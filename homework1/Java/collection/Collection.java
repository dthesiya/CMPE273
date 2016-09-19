import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car {
	private int productionYear, price;
	private String name;

	public Car(int productionYear, int price, String name) {
		this.productionYear = productionYear;
		this.price = price;
		this.name = name;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + " : US$" + price + " : " + productionYear;
	}

	public static Comparator<Car> getYearSorter() {
		return new Comparator<Car>() {
			public int compare(Car o1, Car o2) {
				return o1.getProductionYear() - o2.getProductionYear();
			}

		};
	}

	public static Comparator<Car> getPriceSorter() {
		return new Comparator<Car>() {
			public int compare(Car o1, Car o2) {
				return o1.getPrice() - o2.getPrice();
			}

		};
	}
}

public class Collection {
	List<Car> cars;

	public Collection() {
		cars = new ArrayList<>();
	}

	public void insertCar(int productionYear, int price, String name) {
		cars.add(new Car(productionYear, price, name));
	}

	public List<Car> getSortedByProductionYear() {
		Collections.sort(cars, Car.getYearSorter());
		return cars;
	}

	public List<Car> getSortedByPrice() {
		Collections.sort(cars, Car.getPriceSorter());
		return cars;
	}

	public static void main(String[] args) {
		Collection collection = new Collection();
		collection.insertCar(1992, 50000, "Mustang");
		collection.insertCar(1991, 40000, "Shelby");
		collection.insertCar(1993, 80000, "Corvette");
		collection.insertCar(1980, 150000, "Diablo");

		System.out.println("----------------------------");
		System.out.println("Sorted By Price :");
		for (Car car : collection.getSortedByPrice()) {
			System.out.println(car);
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Sorted By Production Year :");
		for (Car car : collection.getSortedByProductionYear()) {
			System.out.println(car);
		}
	}
}
