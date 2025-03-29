public class Main {
	public static void main(String[] args) {
		String str = "Hello";
		String s = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'o') {
				s = s + str.charAt(i);
			} else {
				s = s + '3';
			}
		}
		System.out.println(s);
	}
}
