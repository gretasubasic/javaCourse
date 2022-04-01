package toString;

public class Main {

	public static void main(String[] args) {
		// toString - a special method all object inherit,
		// that returns a string that textually represents an object. 
		// can be used both implicitly, and explicitly
		
		Car car = new Car();
		
		// this is the car adress in memory

		System.out.println(car);
		System.out.println(car.toString());

	}

}
