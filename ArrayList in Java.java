import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		// ArrayList<Class name> arraylist_variable_name = new ArrayList<>();
		// ArrayList only use class ( Integer | Float | User defined Class | String | Boolean )
		ArrayList <Integer>  list=new ArrayList<>();
	    // Adding elements in list
	    list.add(0);
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    
	    // Printing list
	    System.out.print(list);
	    
	    // Getting elements from list using .get(index)
	    System.out.println("\nPrinting the list using get method:");
	    System.out.println(list.get(0));
	    System.out.println(list.get(1));
	    // add in particular index
	    list.add(2,10);
	    System.out.println(list);
	    
	    // Set/overwrite a existing element in a particular index in list
	    list.set(0,69);
	    System.out.println(list);
	    // Remove/delete element from list,here .remove(index)
	    list.remove(3);
	    System.out.println(list);
	    
	    // size
	    System.out.println("Size of ArrayList: "+list.size());
	    
	    // Sorting
	    Collections.sort(list);
	    System.out.println(list);
	}
}
