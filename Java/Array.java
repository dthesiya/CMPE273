
public class Array {
	Object[] array;

	public Array(int size) {
		array = new Object[size];
	}

	public void insert(int index, Object obj) {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		array[index] = obj;
	}

	public Object get(int index) {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return array[index];
	}

	public Object remove(int index) {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Object obj = array[index];
		array[index] = null;
		return obj;
	}
	
	public static void main(String[] args) {
		Array array = new Array(5);
		// try {
		array.insert(0,"1");
		array.insert(1,"2");
		array.insert(2,"3");
		array.insert(3,"4");
		array.insert(4,"5");
		System.out.println(array.remove(0));
		System.out.println(array.remove(0));
		System.out.println(array.remove(1));
		System.out.println(array.remove(2));
		System.out.println(array.remove(3));
		System.out.println(array.remove(4));
		// } catch (QueueFullException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }catch (QueueEmptyException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
