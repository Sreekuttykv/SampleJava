package polymorphism;

public class Class2 extends Class1{

	public void print(int a,int b)
	{
		super.print(5,8);
		int s=a+b;
		System.out.println("Sum="+s);
		System.out.println("Child class method"); 
		
	}
	public void show()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		
		Class1 obj=new Class2(); 
		obj.print(25,35);
		obj.display();
		
	}

}
