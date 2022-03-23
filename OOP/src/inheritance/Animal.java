package inheritance;

public class Animal {
	private int brain;
	private int body;
	private int size;
	private int weight;
	private String name;
	
	public void eat() {
		System.out.println("say, EAT!");
		
	}
	
	public void move(int speed) {
		System.out.println("Animal moving at " + speed);

		
	}
	
	
	public int getBrain() {
		return brain;
	}



	public int getBody() {
		return body;
	}



	public int getSize() {
		return size;
	}



	public int getWeight() {
		return weight;
	}



	public String getName() {
		return name;
	}



	public Animal(int brain, int body, int size, int weight, String name) {
		super();
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.name = name;
	}
	
	

}
