import java.util.*;
public class Function {
	/*public static void printName(String name){
		System.out.println(name);
	}*/
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 5; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String name=sc.nextLine();
		//printName(name);
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" is:" +factorial(n));
	}
}
