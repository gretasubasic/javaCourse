package human;

public class Main {

	public static void main(String[] args) {
		Human greta = new Human("Greta", 26, 67);
		Human rick = new Human("Rick", 66, 87);


		System.out.println(greta.name);
		rick.eat();
		greta.drink();

	}
	

}
