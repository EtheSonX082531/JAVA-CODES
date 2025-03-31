package JavaArray;
import java.util.*;

public class FindMissingEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements here:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Elements are:");
        int start=arr[0];
        int end=arr[n-1];
        int i=0;
        while(start<=end){
            if(start==arr[i]){
                start++;
                i++;
            }
            else{
                System.out.print(start+" ");
                start++;
            }
        }
        }
    }
