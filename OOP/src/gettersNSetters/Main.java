package gettersNSetters;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		Account b = new Account();

		
		a.setName("Greta");
		a.setAge(23);
		
		b.setAge(24);
		b.setName("Ghana");
		
		System.out.println(a.getAge());
		System.out.println(a.getName());

		
		
	

	}

}
