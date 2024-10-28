package abstractSample;

public abstract class AbstractClass {
	AbstractClass()
	{
		System.out.println("constructor");
	}

	public abstract void display();
	public void hello()
	{
		System.out.println("Non abstract method");
	}
	
	public abstract void print(int a,int b); //abstract method
	public abstract int hi();
	public void show()
	{
		System.out.println("Non abstract method");
	}
	
}
