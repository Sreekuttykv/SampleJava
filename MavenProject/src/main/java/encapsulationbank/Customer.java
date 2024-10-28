package encapsulationbank;

public class Customer {

	private String name;
	private int balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void calculate()
	{
		float interest=(balance*2*5)/100;
		balance+=interest;
	}
}
 