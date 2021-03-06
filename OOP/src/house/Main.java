package house;

public class Main {

	public static void main(String[] args) {
		// this code is creating instances of the House class, changing the color and printing out the result
		// the line House blueHouse = new House("blue"); creates a new instance of the House class. 
		// Remember, House is a blueprint, and we are assigning it to a variable blueHouse. In other words,
		// it is a reference to the object in memory. 
		House blueHouse = new House("blue");
		
		// the next line House anotherHouse = blueHouse; creates another reference to the same object in memory.
		// Here we have two references pointing to the same object in memory. There is still one house, 
		// but two references to that one object. In other words, we have two pieces of paper with the physical adress
		// of where the house is built.
		
		
		
		House anotherHouse = blueHouse;
		
		// NExt, we have two println statements that print the blueHouse color and anotherHouse color. 
		// Both will print blue since we have references to the same object. 
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		// this line calls the method setColor and sets the color to yellow. 
		anotherHouse.setColor("yellow");
		
		// both blueHouse and anotherHouse will now have the same color. Why? let's remember 
		// We have two references that point to the same object in memory. Once we change the color of one,
		// both references still point to the same object. In our real world example, there is still just one physical 
		// house at that one address, even though we have written the same address on two pieces of paper. 
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		
		// here we are creating a new instance of the House class with the color set to "green". Now we have two objects in memory
		// but we have three references which are blueHouse, anotherHouse and greenHouse. The variable (reference) 
		// greenHouse points to a different object in memory, but blueHouse and anotherHouse point to the same object in memory. 
		House greenHouse = new House("green");
		
		// here we assign greenHouse to anotherHouse. In other words, we are dereferencing anotherHouse. It will now 
		// point to different object in memory. Before it was pointing to a "house" that had yellow color, now it points
		// to the house that has green color. In this scenario, we still have 3 references and two objects in memory
		// but blueHouse points to one object, while anotherHouse and greenHouse point to the same object in memory. 
		
		anotherHouse = greenHouse;
		
	
		
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		
		float num = 25; 
		float korijen = 1/2;
		double number = Math.pow(num, 0.5);
		System.out.println(number);
		
		

		
		
	}

}
