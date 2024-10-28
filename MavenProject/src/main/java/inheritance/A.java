package inheritance;

public class A extends Class1{
	public A(int a,int b)
	{	
		
		super(8,9);
		this.display();
		super.sum();
		System.out.println("Super keyword");
		System.out.println("child constructor");
		
	}
	public void display()
	{
		
		System.out.println("Child class  "+super.a);
	}
	public static void main(String args[])
	{
		A a=new A(10,30);
		
		
	}
} 
  