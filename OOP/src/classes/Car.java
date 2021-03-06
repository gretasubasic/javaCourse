package classes;

public class Car {
	
	// public class Car is the statement to create a new Class with the name Car
	// public keyword is access modifier that we use here to determinate access we want to allow
	// other to have to this new class we are creating 
	// word public means unrestricted access to the class 
	// another access modifier we can use are private and that is when no other class can access that class
	// 

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	// what we are trying to create here is a template of the variables that would be part of the car
	// this is the state component which we are defining as fields. 
	
	// when we are in a class, and when we create a method that is going to attach all the objects we create
	// for that particular class 
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		// only if what is passed to us = carrera or commodore will we allow our internal state, our internal
		// model field to be assigned to the value passed to us
		if (validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "unknown";
		}
		
		
		
	}
	// now we have a method that we can call elsewhere to return what the current model is 
	public String getModel() {
		return this.model;
	}
	
	
	// **** String is a special class 
	

}
