package abstractSample;

public class Sample extends AbstractClass {

	public void display()
	{
		System.out.println("Example of sample class");
	}
	public void print()
	{
		System.out.println("Definition abstract method");
	}
	public static void main(String[] args) {
		
		Sample o=new Sample();
		o.display();
		o.print();
		o.show();
		
	}

}
