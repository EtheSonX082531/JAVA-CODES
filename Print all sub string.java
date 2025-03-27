import java.util.*;

public class Main {
	public static void main(String[] args) {
		String str = "abcd";
		for (int i = 0; i <= 3; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.println(str.substring(i, j));
			}
			System.out.println();
		}
	}
}
