import java.util.*;

public class Main {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Hello");
		
		str.append(" World!");
		System.out.println(str);
		
		str.setCharAt(0,'G');
		System.out.println(str);
		
		str.insert(2,'y');
		System.out.println(str);
		
		str.deleteCharAt(2);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		StringBuilder gtr=new StringBuilder("Anik Roy");
		gtr.delete(5,8);
		System.out.println(gtr);
		
		int x=gtr.length();
		System.out.println(x);
		
		int z=12345678;
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		
		
		String htr=Integer.toString(z);
		System.out.println(htr);
	}
}
