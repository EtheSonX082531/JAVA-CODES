import java.util.*;
public class FindMaxMinInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int max,min;
		System.out.println("Enter array size:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		arr[0] = sc.nextInt();
		max = arr[0];
		min = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
	}
}
