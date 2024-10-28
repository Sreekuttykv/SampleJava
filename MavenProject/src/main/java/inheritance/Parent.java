package inheritance;

public class Parent {
	int speed=10;
	 public void display()
	 {
		 System.out.println("Hello");
	 }
	 public static void main(String args[])
	 {
		 Child c=new Child();
		 c.print();
		 c.display();
	 }
}
