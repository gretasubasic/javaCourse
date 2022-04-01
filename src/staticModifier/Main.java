package staticModifier;

public class Main {

	public static void main(String[] args) {
		// static = modifier. A keyword modifier that can be applied to a variable, method, or even Classes,
		// Anything that is static, is also known as static member
		// the class that contains that static member now owns that member weather it is a variable or 
		// a method 
		// anything that class owns is shared by all instances of that class, meaning if we create objects
		// from this class, they all have to share this one variable or method, there is only one copy

		
		Friend friend1 = new Friend("Anthony");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Greta");
		Friend friend4 = new Friend("Sandy");

		


		Friend.displayFriends();
		


	}

}
