package JavaArray;
import java.util.*;
public class CheckSort {
    public static void checkSort(int[] arr, int n){
        if (arr[0] < arr[n-1]) {
            for (int i = 0; i < n - 1; i++) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    System.out.println("Not Sorted!");
                    return ;
                }
            }
            System.out.println("Sorted in ASCENDING order.");
        }
        else{
            for (int i = 0; i < n - 1; i++) {
                int j = i + 1;
                if (arr[i] < arr[j]) {
                    System.out.println("Not Sorted!");
                    return ;
                }
            }
            System.out.println("Sorted in DESCENDING order.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n;
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        checkSort(arr,n);
    }
}
