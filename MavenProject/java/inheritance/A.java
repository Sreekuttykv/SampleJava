package inheritance;

public class A extends Class1{
	public A()
	{
		super(40,20);
		this.display();
		System.out.println("Super keyword");
	}
	public void display()
	{
		super.sum();
		System.out.println("Child class  "+super.a);
	}
	public static void main(String args[])
	{
		A a=new A();
		//a.display();
	}
}
