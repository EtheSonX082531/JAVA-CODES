import java.util.*;
public class numberOfOccurrences {
	public static int numOfoccurr(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number you want to find the occurrences:");
		int x = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count += 1;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		int i = 0;
		System.out.println("Enter elements:");
		while (i < n) {
			arr[i] = sc.nextInt();
			i++;
		}
		int x = numOfoccurr(arr);
		if (x > 0) {
			System.out.println("Number of occurrences: " + x);
		} else {
			System.out.println("No Occurrence!");
		}
	}
}
