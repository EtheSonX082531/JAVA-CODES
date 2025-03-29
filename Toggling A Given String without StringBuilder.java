import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String here:");
		String str=sc.nextLine();
		System.out.println("After Toggling the given String:");
		String temp="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				temp=temp + Character.toUpperCase(str.charAt(i));
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				temp=temp + Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(temp);
		sc.close();
	}
}
