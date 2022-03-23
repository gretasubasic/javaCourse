package gettersNSetters;

public class Account {
	
	// getters and setters allow you to get and set a variables inside of a class
	// a class represents an object 
	
	String name;
	int age;
	
	public static void happyBirthday(String name) {
		System.out.println("Happy birthday " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
