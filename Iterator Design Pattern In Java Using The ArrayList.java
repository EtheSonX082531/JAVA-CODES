import java.util.*;

interface Iterator {
	boolean hasNext();
	Object next();
}

interface Container {
	Iterator getIterator();
}

class NameRepository implements Container {
	ArrayList<String> fruits = new ArrayList<>();
	public NameRepository() {
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pinapple");
		fruits.add("Papaya");
	}

	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index = 0;
		public boolean hasNext() {
			if (index < fruits.size()) {
				return true;
			} else {
				return false;
			}
		}

		public Object next() {
			if (index < fruits.size()) {
				index++;
				return fruits.get(index - 1);
			} else {
				return null;
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		NameRepository repo = new NameRepository();
		Iterator iterator = repo.getIterator();
		int i = 1;
		while (iterator.hasNext()) {
			System.out.println("Fruite " + i + " : " + (String)iterator.next());
			i++;
		}
	}
}
