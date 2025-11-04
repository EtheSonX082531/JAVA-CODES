// Method Overriding 
class A {
	public void method() {
		System.out.println("I am a method of Class A!");
	}
	public void common_method() {
		System.out.println("I am a method of both Class A and B");
	}
}

class B extends A {
	public void method() {
		System.out.println("I am a method of Class B!");
	}
}

public class Method_Overriding_Testing {
	public static void main(String[] args) {
		A a=new A();
		a.method();
		B b=new B();
		b.method();
		
		// Calling general method for class A and B
		b.common_method();
	}
}
