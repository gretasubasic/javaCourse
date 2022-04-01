package constructors;

public class Human {
	
	String name;
	int age;
	double weight;
	
	// and within the constructor,we are going to assign all of these values to each of these variables
	

	Human(String name, int age, double weight){
		
		// 	WE NEED TO ASSIGN EACH OF THESE VALUES to specific object (in this example human) 
		// and one keyword to assign values to object is keyword THIS
		
		this.name = name; // IMAGINE human.name = name; --> would be same as
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking");
	}
	
}
