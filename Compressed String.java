import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		StringBuilder str=new StringBuilder(sc.next());
		StringBuilder final_str=new StringBuilder();
		int i=0;
		while(i<str.length()){
			int j=i,count=0;
			while(j!=str.length() && str.charAt(i)==str.charAt(j)){
				count++;
				j++;
			}
			final_str.append(str.charAt(i));
			final_str.append(count);
			i=j;
		}
	System.out.println(final_str);
	}
}
