//package JavaArray;
import java.util.*;
public class CheckPalindrome {
    public static boolean checkPalindrome(int[] arr,int n){
        for(int i=0;i<=(n/2);i++){
            if(arr[i]!=arr[(n-1)-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag;
        flag=checkPalindrome(arr,n);
        if(flag){
            System.out.println("Yes!Palindrome");
        }
        else{
            System.out.println("Not Palindrome!");
        }
    }
}
