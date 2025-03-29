import java.util.*;
public class Main {
	public static void main(String[] args) {
		String str = "Anik Roy";
		String gtr = "Puja";
		System.out.println(str);
		//string_name.length()
		System.out.println(str.length());
		//string_name.charAt(index);
		System.out.println(str.charAt(5));
		// string_name.indexOf(character);
		System.out.println(str.indexOf('o'));
		/* string_name.compareTo(compared_string_name);
		 it compares two string lexographically
		 if str==gtr
		 ans = 0
		 if str>gtr
		 ans > 0 (positive answer)
		 if str<gtr
		 ans < 0 (negative answer)*/
		System.out.println(str.compareTo(gtr));
		// string_name.contains("string");
		// it returns true/false according to availability of the finding string
		System.out.println(str.contains("Roy"));
		// string_name.startsWith("string");
		System.out.println(gtr.startsWith("Pu"));
		// string_name.endsWith("string");
		System.out.println(gtr.endsWith("Roy"));
		// string_name.toLowerCase();
		System.out.println(str.toLowerCase());
		// string_name.toUpperCase();
		System.out.println(gtr.toUpperCase());
		/* string_name.concat("string_name 2");
		concat() function can't change the original         string in java,it just concatenate one string with another or,multiple strings */
		String concat=str.concat(" "+gtr);
		System.out.println(concat);
		String x="abc";
		x= x + "def" ;
		x= x + 123 ;
		System.out.println(x);
		// string_name.substring(indexBegin,indexEnd);
		String s="Helicopter";
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(4));	
		// it will print "copter" 	
		
		// Using "new"" keyword help to make a pre existing string in java cz without new keyword you can't make a same string with different variable name in java.java always wants to save memory space. 
		
		String y=new String("abcdef123");
		System.out.println(y);
		// string_name.equals(string_2);
		// it returns true false 
		// donot use == to for finding two string equal cz it only compare the address of the both strings not the string ! 
	   System.out.println(str.equals(gtr));
	}
}
