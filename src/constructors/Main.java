package constructors;

public class Main {

	public static void main(String[] args) {
		
		// what is a constructor? 
		// --> constructor is a special method that is called when object is instantiated (CREATED)
		// a constructor is a special method that works behind the scenes that will create an instance
		// of a class for us, it will instantiate an object 
		// basically speaking, our counstructor is acting like a special method 
		
		// why is passing arguments to constructor useful? 
		// --> well, this gives us the ability to create different objects that have different attributes
		// So, we can create a second Human that has different name, age and weight but we first need to assign
		// these values to the attributes to our class, so let's head back to our human class
		// and we need to define name, age and weight
		
		Human human = new Human("Rick", 65, 78);
		System.out.println(human.name);
		
		Human human2 = new Human("Greta", 26, 67);
		System.out.println(human2.name);
		human2.eat();
		human.drink();

		 
		// ---> the point of constructors is that they allow us to construct objects that have varying attributes
		// 
		
		// so, that's why constructors are useful, they allow us to assign different attributes to each object
		// that we instantiate 
	}

}
