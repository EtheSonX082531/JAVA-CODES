package JavaArray;
import java.util.*;
public class DeleteUserElement {
    public static void deleteElement(int[] arr,int x){
        int[] temp=new int[(arr.length)-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=x){
                temp[j]=arr[i];
                j+=1;
            }
            else{
                continue;
            }
        }
        for(int i:temp){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Array Size:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to delete:");
        int x=sc.nextInt();
        deleteElement(arr,x);
    }
}
