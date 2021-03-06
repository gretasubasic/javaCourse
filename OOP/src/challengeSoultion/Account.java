package challengeSoultion;

public class Account {
	private int number;
	private double balance;
	private String name;
	private String emailAdress;
	private String phone;
	
	
	// counstructors - what we can essentially do is perform initialization 
	// constructor is created automatically by Java and when we type new Account(); this is actually
	// calling the constructor 
	
	public Account() {
		System.out.println("Empty constructor called");
	}
	
	public Account(int number, double balance, String name, String emailAdress, String phone) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.emailAdress = emailAdress;
		this.phone = phone;
	}
	
	
	
	public Account(String name, String emailAdress, String phone) {
		super();
		this.name = name;
		this.emailAdress = emailAdress;
		this.phone = phone;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}
	
	public void withdrawl(double withdrawalAmount) {
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed." );
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount);
		}
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
