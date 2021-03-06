package inheritance;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
		// when we select constructor - what happens is automatically those 5 parameters 
		// that are dealing with the animal class have been created as parameters to the Dog class 
		// in other words, to the dog constructor and then this keyword super has come up
		// So what does super means is to call the constructor that is for the class we are extending from 
		// so in this case superclass we are inheriting from 
		// what this does it allows us to initialize the animal class - and if we recall, Dog is 
		// actually part of Animal class - We are saying Dog class is BASED on ANIMAL class but what we can also do
		// is we can add more features to this dog class, things that are unique for dog 
		
		// so what the first line has done (line 3) it initialized base caracheristics of an animal 
		// (brain body, size, weight, name) in a constructor. 
		// But what we can also do is, because we are working in a Dog class, we can assign extra fields add extra behavior
		// that are unique for dog 
		//
		// 
		
		super(1, 1, size, weight, name);
		// 
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	// override = in other words, we can create a version of that same method that exists in Animal class
	// but make it unique for Dog class 
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(4);
		
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("Dog.move() called");
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	

}
