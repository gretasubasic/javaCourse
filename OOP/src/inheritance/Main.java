package inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal(1, 5, 4, 1, "Beu");
		Dog dog = new Dog(5, 4,"Yoko", 2, 3, 4, 5, "Fur");
		dog.eat();
		dog.walk();
		dog.run();

	}

}
