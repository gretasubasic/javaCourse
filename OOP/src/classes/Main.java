package classes;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		
		// WHY WOULD WE USE GETTERS AND SETTERS?
		// 
		
		porsche.setModel("911");
		System.out.println("Model is " + porsche.getModel());
		

	}

}
