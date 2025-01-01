import java.util.*;;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, c;
		System.out.println("Enter array rows:");
		r = sc.nextInt();
		System.out.println("Enter array column");
		c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Enter array elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose Matrix:");
		for (int i = 0; i < r ; i++) {
			for (int j = i+1 ; j < c; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
