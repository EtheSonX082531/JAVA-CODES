import java.util.*;

interface MyIterator{
    boolean hasNext();
	Object next();
}

// Concrete class of interface MyIterator
class MyIteratorImpl implements MyIterator {
	private List<User> list = new ArrayList<>();
	private int position = 0;

	public MyIteratorImpl(List<User> list) {
		this.list = list;
	}

	public boolean hasNext() {
		if (position < list.size()) {
			return true;
		} else {
			return false;
		}
	}

	public User next() {
		position += 1;
		return list.get(position - 1);
	}

}

// User class ------------------------------------------------------
class User {
	private String name;
	private String user_id;

	public User(String name, String user_id) {
		this.name = name;
		this.user_id = user_id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_id() {
		return user_id;
	}
}
//------------------------------------------------------------------------

class UserManagement {
	ArrayList<User> userlist = new ArrayList<>();

	public void addUser(User user) {
		userlist.add(user);
	}

	public User getUser(int index) {
		return userlist.get(index);
	}

	public MyIterator getIterator() {
		return new MyIteratorImpl(userlist);
	}

}

public class Main {
	public static void main(String[] args) {
		// Making UserManagement class
		UserManagement usermanagement = new UserManagement();

		// Adding some User Object using UserManagement method
		usermanagement.addUser(new User("Anik Roy", "102409"));
		usermanagement.addUser(new User("Smita Paramita Shreya", "111213"));
		usermanagement.addUser(new User("Marian Roy Chowdhury", "212223"));


		MyIterator my_iterator = usermanagement.getIterator();
		
		while(my_iterator.hasNext()){
			User user=(User)my_iterator.next();
			System.out.println("Name of User: "+user.getName()+" \nUser Id: "+user.getUser_id());
		}
	}
}
