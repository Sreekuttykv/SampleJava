package inheritance;

public class B extends Class1{
	public B()
	{
		super(10,20);
		System.out.println("constructor");
	}
	public void print()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		//b.sum();
		//b.print(); 
		
	}

} 
