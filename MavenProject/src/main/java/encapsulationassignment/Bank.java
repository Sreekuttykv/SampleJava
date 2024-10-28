package encapsulationassignment;

public class Bank {
	private int pin;
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validate()
	{
		if(pin==1001|| pin==1234|| pin==1212)
		{
			System.out.println("Valid pin");
			System.out.println("Collect your money");
			
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}

}
