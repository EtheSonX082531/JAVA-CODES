import java.util.*;
public class Main {
	public static int checkPalindrome(String x) {
		for (int i = 0, j = x.length() - 1; i <= j; i++, j--) {
			if (x.charAt(i) != x.charAt(j)) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String here:");
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String x = str.substring(i, j) ;
					count = count + checkPalindrome(x);
				}
			}
		System.out.println("Number of Palindromic sub-Strings of the given string:");
		System.out.println(count);
	}
}
