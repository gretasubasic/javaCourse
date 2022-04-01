package superHero;

public class Main {

	public static void main(String[] args) {
		// super keyword - refers to the superclass (parent of the object) 
		// very similar to "this" keyword
		
		Hero hero1 = new Hero("Batman", 42, "money");
		Hero hero2 = new Hero("Superman", 25, "everything");
		
		System.out.println(hero2.toString());

	}

}
