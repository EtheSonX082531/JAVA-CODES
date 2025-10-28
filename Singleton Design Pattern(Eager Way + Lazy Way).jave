// Lazy initialization Singleton Design Pattern
class Singleton {
	private static Singleton s1;
	private Singleton() {

	}

// For thread safety we use synchronized keyword
	public static synchronized Singleton getSingleton() {
		if (s1 == null) {
			return s1 = new Singleton();
		} else {
			return s1;
		}
	}
}

// Eager initialization Singleton Design Pattern
// Another method of making Singleton design pattern...
class Singleton2 {
	private Singleton2() {};
	private static Singleton2 s1 = new Singleton2();
	public static Singleton2 getSingleton2() {
		return s1;
	}
}

public class Main {
	public static void main(String[] args) {
		Singleton x = Singleton.getSingleton();
		System.out.println(x.hashCode());
		Singleton x2 = Singleton.getSingleton();
		System.out.println(x2.hashCode());


		Singleton2 x3 = Singleton2.getSingleton2();
		System.out.println(x3.hashCode());
		Singleton2 x4 = Singleton2.getSingleton2();
		System.out.println(x4.hashCode());
	}
}
