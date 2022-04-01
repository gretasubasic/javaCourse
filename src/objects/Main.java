package objects;

public class Main {

	public static void main(String[] args) {
		// with objects, they contain attributes and methods
		// example - phone, desk
		// --> ATTRIBUTES - caracheristics that this object has and METHODS as different actions that this object 
		// can perform
		
		// --> this is how to construct an instance of Class - we are going to be constructing a Car object
		// so first we begin with the name of the Class, next we can create a unique name 
		
		
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		
		System.out.println(myCar1.color);
		System.out.println(myCar1.model);
		System.out.println(myCar2.color);
		System.out.println(myCar2.model);
//		
//		myCar.drive();
//		myCar.brake();
		
		// Now, with classes we can reuse Class to instantiate multiple instances of the class meaning
		// we can use this class to create multiple objects
	}

}
