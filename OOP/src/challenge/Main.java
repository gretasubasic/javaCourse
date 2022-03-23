package challenge;

public class Main {

	public static void main(String[] args) {
		BankAccount person1 = new BankAccount();
		VipCustomer customer = new VipCustomer("Suzane", 333.3, "suzane@gmail.com");
		
		person1.setNumber(24);
		person1.setBalance(356);
		System.out.println("Number is " + person1.getNumber());
		System.out.println("VIP customer name is " + customer.getName());
		
		
		depositFunds();
		deductBalance();
		
		
	}
	
	public static void depositFunds() {
		BankAccount person = new BankAccount();
		person.setBalance(3463);
		int balance = person.getBalance();
		balance ++;
		System.out.println(balance);
		
	}
	
	public static void deductBalance() {
		BankAccount person = new BankAccount();
		person.setBalance(3463);
		int balance = person.getBalance();
		int insuficiantBalance = 300;
		if (balance <= insuficiantBalance) {
			System.out.println("You cannot withdraw the funds, unsuficiant amount");
		} else { 
			balance--;
			System.out.println(balance);
		}
	}

}
