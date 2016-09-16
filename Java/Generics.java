import java.util.ArrayList;
import java.util.List;

class Eatables {
	private String name;
	private int quantity;

	public Eatables(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String toString() {
		return "name : " + name + " && quantity : " + quantity;
	}
}

class Apparels {
	private String name;
	private int size;

	public Apparels(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String toString() {
		return "name : " + name + " && size : " + size;
	}
}

public class Generics<T> {
	private List<T> list;

	public Generics() {
		list = new ArrayList<>();
	}

	public void insert(T t) {
		list.add(t);
	}

	public List<T> getList() {
		return list;
	}

	public static void main(String[] args) {
		System.out.println("---------Eatables---------");
		Generics<Eatables> eatables = new Generics<>();
		eatables.insert(new Eatables("Chips", 150));
		eatables.insert(new Eatables("Bars", 400));
		eatables.insert(new Eatables("Cold Drinks", 250));
		for (Eatables eatable : eatables.getList()) {
			System.out.println(eatable);
		}
		
		System.out.println("---------Apparels---------");
		Generics<Apparels> apparels = new Generics<>();
		apparels.insert(new Apparels("Shirts", 150));
		apparels.insert(new Apparels("Jeans", 400));
		apparels.insert(new Apparels("Skirts", 250));
		for (Apparels apparel : apparels.getList()) {
			System.out.println(apparel);
		}
	}
}
