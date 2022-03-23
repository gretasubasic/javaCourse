package challenge;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	
	


	public String getName() {
		return name;
	}


	public double getCreditLimit() {
		return creditLimit;
	}


	public String getEmail() {
		return email;
	}


	public VipCustomer() {
		this("Default name", 222.2, "default.email@gmail.com");
	}
	

	public VipCustomer(double creditLimit, String email) {
		this("Bob", creditLimit, email);
	}

	public VipCustomer(String name, double creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}


	
	
	
	

}
