package interfaceexample;

public class InterfaceClass implements Interface3{
	public void print()
	{
		System.out.println("Interface method");
	}
	public void show()
	{
		System.out.println("Welcome to interface");
		System.out.println("value: "+MAX_VALUE);
	}
	public void display()
	{
		System.out.println("value: "+MAX_VALUE);
	}
	public int print2(int num)
	{
		num+=MAX_VALUE;
		return num;
	}
	public void hello()
	{
			System.out.println("hello");
			System.out.println("Min value"+MIN);
		
	}
	public static void main(String args[])
	{
		InterfaceClass obj=new InterfaceClass();
		obj.display();
		obj.print();
		obj.show();
		obj.hello();
		System.out.println("Method in interface2: "+obj.print2(100));
	}
	

}
