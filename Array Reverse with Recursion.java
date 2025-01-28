import java.util.*;
public class ArrayReverse {
	public static void reverseArray(int[] arr, int i, int j) {
		if (i > j) {
			return ;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		reverseArray(arr, i + 1, j - 1);
		return ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter array size:");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		reverseArray(arr, 0, n - 1);
		System.out.println("After reversing:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
