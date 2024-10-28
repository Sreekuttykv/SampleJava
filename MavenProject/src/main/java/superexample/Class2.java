package superexample;

public class Class2 extends Class1 {
	int a=4;
	
	public Class2(int a,int b)
	{
		super(1,3,4);
		super.eat();
		int s=a+b;
		System.out.println(s);
		System.out.println(a);
		
		System.out.println("child class constructor");
	}
	public void eat()
	{
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(b);
		super.eat();
		super.show();
		System.out.println("Eating...(Child)");
	}

	public static void main(String args[])
	{
		Class2 o=new Class2(10,3);
		o.eat();
 		//System.out.println(super.a);  can't use super in static
		//super.eat();  can't access in static context
		
	}
	
	

}
