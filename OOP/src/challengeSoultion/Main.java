package challengeSoultion;

public class Main {

	public static void main(String[] args) {
		Account bobsAccount = new Account(1235, 222.2, "greta", "gsfs@gmail.com", "9929229");
		System.out.println(bobsAccount.getNumber());
		
		bobsAccount.deposit(50);
		bobsAccount.withdrawl(100);


	}

}
