//package JavaArray;
import java.util.*;
public class Merge2Array {
    public static int[] merge_array(int[] arr1,int[] arr2,int a,int b){
        int[] temp=new int[a+b];
        int j=0;
        for(int i=0;i<(a+b);i++){
            if(i<a) {
                temp[i] = arr1[i];
            }
            else{
                temp[i] = arr2[j];
                j++;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first array size:");
        a=sc.nextInt();
        int[] arr1=new int[a];
        System.out.println("Enter first array elements:");
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array size:");
        b=sc.nextInt();
        int[] arr2=new int[b];
        System.out.println("Enter second array elements:");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        int[] mergeArr=new int[a+b];
        mergeArr=merge_array(arr1,arr2,a,b);
        System.out.println("Merged array is:");
        for(int i:mergeArr){
            System.out.print(i+" ");
        }
    }
}
