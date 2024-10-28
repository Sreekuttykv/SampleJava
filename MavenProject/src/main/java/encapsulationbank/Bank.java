package encapsulationbank;

public class Bank {


	public static void main(String[] args) {
		Customer obj=new Customer();
		obj.setName("Anu");
		obj.setBalance(5000);
		obj.calculate();
		System.out.println("Name :"+obj.getName());
		System.out.println("Balance :"+obj.getBalance());
		

	}

}
 