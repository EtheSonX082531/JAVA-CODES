//https://chatgpt.com/share/68616253-d0f0-800a-a0a4-a302ac003bcd
public class Main {
	
	public static int sumAnyNumbers(int ... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum = sum + n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
    System.out.println(sumAnyNumbers(1,2,3));
	}
}
