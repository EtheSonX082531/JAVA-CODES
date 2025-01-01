import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		boolean flag = false;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements for array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter search key:");
		int key = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				System.out.println("Key found in index: "+i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Key not found!");
		}
	}
}
