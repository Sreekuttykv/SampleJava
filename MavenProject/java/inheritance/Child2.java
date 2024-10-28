package inheritance;

public class Child2 extends Child{
	public void sum()
	{
		int a=10;
		int b=20;
		int r=a+b;
		System.out.println("Sum="+r);
	}
	public static void main(String args[])
	{
		Child2 c=new Child2();
		c.print();
		c.display();
		c.sum();
	}
}	 
