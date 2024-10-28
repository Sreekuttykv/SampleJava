package encapsulationsample;

public class User {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setPin(1212);
		b.validate();
		System.out.println("Pin number=" +b.getPin());

	}

}






/*Class 1- Bank
One method to set pin from „User‟ class and validate Pin in another method
[Valid pins – 1001, 1234, 1212]
Pin number should declared as private
 Class 2 – User
Get the pin from User */