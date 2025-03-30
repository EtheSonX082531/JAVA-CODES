package Strings;
import java.util.*;

public class String_Toggling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String Here:");
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println("After Toggling The String is:");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                str.setCharAt(i, (char)(str.charAt(i)-32));
            }
            else if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                str.setCharAt(i,(char)(str.charAt(i)+32));
            }
        }
        System.out.println(str);
    }
}
