import java.util.*;
public class Main {
	public static int[] Merge(int[] arr1, int[] arr2, int a, int b) {
		int[] temp = new int[a + b];
		int i = 0, j = 0, k = 0;
		while (j < a && k < b) {
			if (arr1[j] <= arr2[k]) {
				temp[i] = arr1[j];
				j++;
			} else {
				temp[i] = arr2[k];
				k++;
			}
			i++;
		}
		while (j < a) {
			temp[i] = arr1[j];
			j++;
			i++;
		}
		while (k < b) {
			temp[i] = arr2[k];
			k++;
			i++;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter first array size:");
		a = sc.nextInt();
		int[] arr1 = new int[a];
		System.out.println("Enter first array elements in Ascending Order:");
		for (int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt();
		}
		int b;
		System.out.println("Enter second array size:");
		b = sc.nextInt();
		int[] arr2 = new int[b];
		System.out.println("Enter second array elements in Ascending Order:");
		for (int i = 0; i < b; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr = new int[a + b];
		arr = Merge(arr1, arr2, a, b);
		System.out.println("After Merging in sorted form(Ascending Order):");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
